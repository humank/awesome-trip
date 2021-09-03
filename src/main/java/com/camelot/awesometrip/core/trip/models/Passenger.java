package com.camelot.awesometrip.core.trip.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Passenger {
    private String passportId;
    private String identity;
    private String email;
    private String phoneNumber;

    //passportId	Identity	email	phoneNumber
    public Passenger(String passportId, String identity, String email, String phoneNumber) {

        this.passportId = passportId;
        this.identity = identity;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
