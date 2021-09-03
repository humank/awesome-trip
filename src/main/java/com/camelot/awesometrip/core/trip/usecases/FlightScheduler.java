package com.camelot.awesometrip.core.trip.usecases;

import com.camelot.awesometrip.core.trip.models.Flight;
import com.camelot.awesometrip.infrastrucutre.dataproviders.FlightRepository;
import com.camelot.awesometrip.infrastrucutre.entrypoints.trip.FlySearchRequest;

import java.util.List;

public class FlightScheduler {

    private final FlightRepository flightRepository;

    public FlightScheduler(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> search(FlySearchRequest flySearchRequest) {

        return flightRepository.searchByDepartTime(flySearchRequest);
    }
}
