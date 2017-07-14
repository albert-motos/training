package com.hightechware.training.odigeo.challenges.challenge_2;

/**
 * Created by albert-motos on 14/07/2017.
 */
class Flight {
    private final int id;
    private final String flightNumber;

    Flight(int id, String flightNumber) {
        this.id = id;
        this.flightNumber = flightNumber;
    }

    public int getId() {
        return id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }
}
