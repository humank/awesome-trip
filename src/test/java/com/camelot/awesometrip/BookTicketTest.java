package com.camelot.awesometrip;

import com.camelot.awesometrip.core.trip.models.Flight;
import com.camelot.awesometrip.core.trip.models.Passenger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.ArrayList;
import java.util.List;

public class BookTicketTest {

    List<Passenger> passengers;
    Flight flight;

    @Given("given passengers' information")
    public void given_passengers_information(io.cucumber.datatable.DataTable dataTable) {

        passengers = new ArrayList<>();
        dataTable.cells()
                .stream()
                .skip(1)
                .map(fields -> new Passenger(fields.get(0), fields.get(1), fields.get(2), fields.get(3)))
                .forEach(passengers::add);

    }
    @When("book for flight with flightInformation")
    public void book_for_flight_with_flight_information(io.cucumber.datatable.DataTable dataTable) {
       flight = new Flight();
        dataTable.cells()
                .stream()
                .skip(1)
                .map(fields -> new Flight(fields.get(0),fields.get(1),fields.get(2),fields.get(3),fields.get(4),fields.get(5),fields.get(6)));

    }

    @When("need to check-in luggage for")
    public void need_to_check_in_luggage_for(io.cucumber.datatable.DataTable dataTable) {


    }
    @Then("there should have {int} flightTickets be booked")
    public void there_should_have_flight_tickets_be_booked(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
