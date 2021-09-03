package com.camelot.awesometrip.infrastrucutre.entrypoints.trip;

public class FlySearchRequest {
    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getDepartDay() {
        return departDay;
    }

    private final String to;
    private final String from;
    private String departDay;

    public FlySearchRequest(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void addDepartDay(String departDay) {
        this.departDay =departDay;
    }
}
