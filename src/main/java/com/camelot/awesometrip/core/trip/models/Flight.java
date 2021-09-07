package com.camelot.awesometrip.core.trip.models;

//import com.camelot.awesometrip.infrastrucutre.entrypoints.trip.FlySearchRequest;
import com.camelot.dddcommons.baseclasses.AggregateRoot;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Flight extends AggregateRoot<FlightId> {

    private String flightNumber;
    private String departFrom;
    private String arriveTo;
    private String departTime;
    private String returnTime;
    private String seatClass;
    private String isRoundTrip;
    private String from;
    private String to;
    private String price;

    //private FlySearchRequest flySearchRequest;

    public Flight(String flightNumber, String departTime, String from, String to, String price) {
        this.flightNumber = flightNumber;
        this.departTime = departTime;
        this.from = from;
        this.to = to;
        this.price = price;
        super.setId(new FlightId());
    }

    public Flight() {
        super.setId(new FlightId());
    }


    public Flight(String flightNumber, String departFrom, String arriveTo, String departTime, String returnTime, String seatClass, String isRoundTrip) {
        this.flightNumber = flightNumber;
        this.departFrom = departFrom;
        this.arriveTo = arriveTo;
        this.departTime = departTime;
        this.returnTime = returnTime;
        this.seatClass = seatClass;
        this.isRoundTrip = isRoundTrip;
        super.setId(new FlightId());
    }
}
