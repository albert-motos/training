package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mario.dominguez on 10/07/2017.
 */
public class FlightRecommendationParser extends AbstractFlightRecommendationParser {

    private Random rnd;
    private List<FlightRecommendation> flightRecommendations;
    private List<Flight> outBoundFlights;
    private List<Flight> inBoundFlights;

    public FlightRecommendationParser() {
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

    @Override
    protected long executeParseRecommendation() {
        long init = System.currentTimeMillis();

        List<ParsedFlight> parsedFlights = new ArrayList<>();
        for (FlightRecommendation recommendation : flightRecommendations) {
            parsedFlights.add(parseRecommendation(recommendation, outBoundFlights, inBoundFlights));
        }

        return System.currentTimeMillis() - init;
    }

}

