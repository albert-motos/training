package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mario.dominguez on 10/07/2017.
 */
public abstract class AbstractFlightRecommendationParser {

    public static int FLIGHT_NUM = 100000;
    public static int RECO_NUM = 10000;
    public static int CACHE_DELAY = 2;

    protected List<Flight> buildFlights(Random rnd) {
        List<Flight> flights = new ArrayList<Flight>();
        for (int i = 0; i < FLIGHT_NUM; i++) {
            flights.add(new Flight(i, "FA" + rnd.nextInt(1000)));
        }
        return flights;
    }

    protected List<FlightRecommendation> buildFlightRecommendations(Random rnd) {
        List<FlightRecommendation> recommendations = new ArrayList<FlightRecommendation>();
        for (int i = 0; i < RECO_NUM; i++) {
            recommendations.add(new FlightRecommendation(rnd.nextInt(1000), rnd.nextInt(FLIGHT_NUM), rnd.nextInt
                    (FLIGHT_NUM)));
        }
        return recommendations;
    }

    protected abstract long executeParseRecommendation();

}

