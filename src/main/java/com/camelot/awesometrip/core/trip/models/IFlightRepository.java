package com.camelot.awesometrip.core.trip.models;

import com.camelot.awesometrip.infrastrucutre.entrypoints.trip.FlySearchRequest;

import java.util.List;

public interface IFlightRepository {

    List<Flight> searchByDepartTime(FlySearchRequest flySearchRequest);
}
