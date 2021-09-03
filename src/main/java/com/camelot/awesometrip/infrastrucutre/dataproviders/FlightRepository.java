package com.camelot.awesometrip.infrastrucutre.dataproviders;

import com.camelot.awesometrip.core.trip.models.Flight;
import com.camelot.awesometrip.core.trip.models.IFlightRepository;
import com.camelot.awesometrip.infrastrucutre.entrypoints.trip.FlySearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRepository implements IFlightRepository {

    private final List<Flight> inlineMockedAvailableFlights;

    public FlightRepository() {
        inlineMockedAvailableFlights = new ArrayList<Flight>();
        inlineMockedAvailableFlights.add(new Flight("CI0220", "2021-11-11 03:30:00", "桃園(TPE)", "函館(HKD)", "1800"));
        inlineMockedAvailableFlights.add(new Flight("CI0220", "2021-11-11 18:30:00", "桃園(TPE)", "函館(HKD)", "2120"));
        inlineMockedAvailableFlights.add(new Flight("CI0220", "2021-12-12 03:30:00", "桃園(TPE)", "函館(HKD)", "1800"));
        inlineMockedAvailableFlights.add(new Flight("CI0220", "2021-12-12 04:30:00", "桃園(TPE)", "函館(HKD)", "1800"));
        inlineMockedAvailableFlights.add(new Flight("CI0220", "2021-12-12 05:30:00", "桃園(TPE)", "函館(HKD)", "1800"));
    }


    @Override
    public List<Flight> searchByDepartTime(FlySearchRequest flySearchRequest) {

        return inlineMockedAvailableFlights.stream().filter(flight -> flight.getDepartTime().startsWith(flySearchRequest.getDepartDay()))
                .collect(Collectors.toList());
    }
}
