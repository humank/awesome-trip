package com.camelot.awesometrip;

import com.camelot.awesometrip.core.trip.models.Flight;
import com.camelot.awesometrip.core.trip.usecases.FlightScheduler;
import com.camelot.awesometrip.infrastrucutre.dataproviders.FlightRepository;
import com.camelot.awesometrip.infrastrucutre.entrypoints.trip.FlySearchRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchFlightsTest {

    FlySearchRequest flySearchRequest;

    @Given("a passenger want to book a flight from TPE to HKD")
    public void a_passenger_want_to_book_a_flight_from_tpe_to_hkd() {
        flySearchRequest = new FlySearchRequest("TPE", "HKD");

    }

    @When("searching for depart_day as {string}")
    public void searchingForDepart_dayAs(String departDay) {

        flySearchRequest.addDepartDay(departDay);
    }

    @Then("the flowing flights will show up")
    public void the_flowing_flights_will_show_up(io.cucumber.datatable.DataTable dataTable) {

        List<Flight> expectedSearchFlightsResult = new ArrayList<Flight>();
        List<Flight> actualFlightsList = new FlightScheduler(new FlightRepository()).search(flySearchRequest);

        dataTable.cells()
                .stream()
                .skip(1)
                .map(fields -> new Flight(fields.get(0), fields.get(1), fields.get(2), fields.get(3), fields.get(4)))
                .forEach(expectedSearchFlightsResult::add);

        assertEquals(2, actualFlightsList.size());
        assertEquals(2, expectedSearchFlightsResult.size());
        assertEquals(expectedSearchFlightsResult, actualFlightsList);
    }
}
