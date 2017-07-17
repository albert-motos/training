package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by mario.dominguez on 10/07/2017.
 */
public class FlightRecommendationParser_v1 extends AbstractFlightRecommendationParser {

    private Random rnd;
    private List<FlightRecommendation> flightRecommendations;
    private Map<Integer, Flight> outBoundFlights;
    private Map<Integer, Flight> inBoundFlights;

    public FlightRecommendationParser_v1() {
        rnd = new Random(1);
        flightRecommendations = buildFlightRecommendations(rnd);
        outBoundFlights = buildFlights(rnd);
        inBoundFlights = buildFlights(rnd);
    }

    protected ParsedFlight parseRecommendation(FlightRecommendation recommendation, List<Flight> outBoundFlights, List<Flight> inBoundFlights) {
        return new ParsedFlight(recommendation.getPrice(), parseFlight(outBoundFlights, recommendation.getOutboungFlightId()), parseFlight(inBoundFlights, recommendation.getInboungFlightId()));
    }

    protected String parseFlight(List<Flight> flights, int flightid) {
        for (Flight flight : flights) {
            if (flight.getId() == flightid) {
                return flight.getFlightNumber();
            }
        }
        return "";
    }

    private Map<Integer, Flight> buildFlights(Random rnd) {
        Map<Integer, Flight> result = new HashMap<>();

        for (int i = 0; i < FLIGHT_NUM; i++) {
            result.put(i, new Flight(i, "FA" + rnd.nextInt(1000)));
        }

        return result;
    }

    @Override
    public long executeParseRecommendation() {
        long init = System.currentTimeMillis();

        List<ParsedFlight> parsedFlights = new ArrayList<>();
        for (FlightRecommendation recommendation : flightRecommendations) {
//            parsedFlights.add(parseRecommendation(recommendation, outBoundFlights, inBoundFlights));
        }

        return System.currentTimeMillis() - init;
    }

}

