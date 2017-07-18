package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRecommendationParser_v1 extends AbstractFlightRecommendationParser {

    private Map<Integer, Flight> outBoundFlights;
    private Map<Integer, Flight> inBoundFlights;

    FlightRecommendationParser_v1(FlightRecommendationStorage flightRecommendationStorage) {
        flightRecommendations = flightRecommendationStorage.flightRecommendations;
        outBoundFlights = listToHashMap(flightRecommendationStorage.outBoundFlights);
        inBoundFlights = listToHashMap(flightRecommendationStorage.inBoundFlights);
    }

    private ParsedFlight parseRecommendation(FlightRecommendation recommendation, Map<Integer, Flight> outBoundFlights, Map<Integer, Flight> inBoundFlights) {
        return new ParsedFlight(recommendation.getPrice(), parseFlight(outBoundFlights, recommendation.getOutboungFlightId()), parseFlight(inBoundFlights, recommendation.getInboungFlightId()));
    }

    private String parseFlight(Map<Integer, Flight> flights, int flightid) {
        String result = "";

        Flight flight = flights.get(flightid);
        if (flight != null) {
            result = flight.getFlightNumber();
        }

        return result;
    }

    private Map<Integer, Flight> listToHashMap(List<Flight> flightList) {
        Map<Integer, Flight> result = new HashMap<>();

        for (Flight flight : flightList) {
            result.put(flight.getId(), flight);
        }

        return result;
    }

    @Override
    public long executeParseRecommendation() {
        long init = System.currentTimeMillis();

        List<ParsedFlight> parsedFlights = new ArrayList<>();
        for (FlightRecommendation recommendation : flightRecommendations) {
            parsedFlights.add(parseRecommendation(recommendation, outBoundFlights, inBoundFlights));
        }

        return System.currentTimeMillis() - init;
    }

}

