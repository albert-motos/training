package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.List;

public class FlightRecommendationParser_v0 extends AbstractFlightRecommendationParser {

    private List<Flight> outBoundFlights;
    private List<Flight> inBoundFlights;

    FlightRecommendationParser_v0(FlightRecommendationStorage flightRecommendationStorage) {
        flightRecommendations = flightRecommendationStorage.flightRecommendations;
        outBoundFlights = flightRecommendationStorage.outBoundFlights;
        inBoundFlights = flightRecommendationStorage.inBoundFlights;
    }

    private ParsedFlight parseRecommendation(FlightRecommendation recommendation, List<Flight> outBoundFlights, List<Flight> inBoundFlights) {
        return new ParsedFlight(recommendation.getPrice(), parseFlight(outBoundFlights, recommendation.getOutboungFlightId()), parseFlight(inBoundFlights, recommendation.getInboungFlightId()));
    }

    private String parseFlight(List<Flight> flights, int flightid) {
        for (Flight flight : flights) {
            if (flight.getId() == flightid) {
                return flight.getFlightNumber();
            }
        }
        return "";
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