package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.hightechware.training.odigeo.challenges.challenge_2.AbstractFlightRecommendationParser.FLIGHT_NUM;
import static com.hightechware.training.odigeo.challenges.challenge_2.AbstractFlightRecommendationParser.RECO_NUM;

class FlightRecommendationStorage {

    final List<Flight> outBoundFlights;
    final List<Flight> inBoundFlights;
    final List<FlightRecommendation> flightRecommendations;

    FlightRecommendationStorage() {
        Random rnd = new Random(1);
        outBoundFlights = buildFlights(rnd);
        inBoundFlights = buildFlights(rnd);
        flightRecommendations = buildFlightRecommendations(rnd);
    }

    private List<Flight> buildFlights(Random rnd) {
        List<Flight> flights = new ArrayList<>();
        for (int i = 0; i < FLIGHT_NUM; i++) {
            flights.add(new Flight(i, "FA" + rnd.nextInt(1000)));
        }
        return flights;
    }

    private List<FlightRecommendation> buildFlightRecommendations(Random rnd) {
        List<FlightRecommendation> recommendations = new ArrayList<>();
        for (int i = 0; i < RECO_NUM; i++) {
            recommendations.add(new FlightRecommendation(rnd.nextInt(1000), rnd.nextInt(FLIGHT_NUM), rnd.nextInt
                    (FLIGHT_NUM)));
        }
        return recommendations;
    }

}
