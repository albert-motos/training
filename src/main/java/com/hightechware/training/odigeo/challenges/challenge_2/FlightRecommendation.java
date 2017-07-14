package com.hightechware.training.odigeo.challenges.challenge_2;

/**
 * Created by albert-motos on 14/07/2017.
 */
class FlightRecommendation {
    private final int price;
    private final int outboungFlightId;
    private final int inboungFlightId;

    FlightRecommendation(int price, int outboungFlightId, int inboungFlightId) {
        this.price = price;
        this.outboungFlightId = outboungFlightId;
        this.inboungFlightId = inboungFlightId;
    }

    public int getPrice() {
        return price;
    }

    public int getOutboungFlightId() {
        return outboungFlightId;
    }

    public int getInboungFlightId() {
        return inboungFlightId;
    }
}
