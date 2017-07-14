package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mario.dominguez on 10/07/2017.
 */
public class FlightRecommendationParser {
    public static int FLIGHT_NUM = 100000;
    public static int RECO_NUM = 10000;
    public static int CACHE_DELAY = 2;

    public static void main(String[] args) {
        System.out.println("Building scenario");
        Random rnd = new Random(1);
        List<FlightRecommendation> flightRecommendations = buildFlightRecommendations(rnd);
        List<Flight> outBoundFlights = buildFlights(rnd);
        List<Flight> inBoundFlights = buildFlights(rnd);

        System.out.println("Start parsing");
        long l = System.currentTimeMillis();

        List<ParsedFlight> parsedFlights = new ArrayList<>();
        for (FlightRecommendation recommendation : flightRecommendations) {
            parsedFlights.add(parseRecommendation(recommendation, outBoundFlights, inBoundFlights));
        }

        System.out.println(System.currentTimeMillis() - l + " milliseconds");
    }

    private static ParsedFlight parseRecommendation(FlightRecommendation recommendation, List<Flight>
            outBoundFlights, List<Flight> inBoundFlights) {
        return new ParsedFlight(recommendation.getPrice(), parseFlight(outBoundFlights, recommendation
                .getOutboungFlightId()), parseFlight(inBoundFlights, recommendation.getInboungFlightId()));
    }

    private static String parseFlight(List<Flight> flights, int flightid) {
        for (Flight flight : flights) {
            if (flight.getId() == flightid) {
                return flight.getFlightNumber();
            }
        }
        return "";
    }

    private static List<Flight> buildFlights(Random rnd) {
        List<Flight> flights = new ArrayList<Flight>();
        for (int i = 0; i < FLIGHT_NUM; i++) {
            flights.add(new Flight(i, "FA" + rnd.nextInt(1000)));
        }
        return flights;
    }

    private static List<FlightRecommendation> buildFlightRecommendations(Random rnd) {
        List<FlightRecommendation> recommendations = new ArrayList<FlightRecommendation>();
        for (int i = 0; i < RECO_NUM; i++) {
            recommendations.add(new FlightRecommendation(rnd.nextInt(1000), rnd.nextInt(FLIGHT_NUM), rnd.nextInt
                    (FLIGHT_NUM)));
        }
        return recommendations;
    }

}

class ParsedFlight {
    private final int price;
    private final String outboundFlight;
    private final String inboundFlight;

    ParsedFlight(int price, String outboundFlight, String inboundFlight) {
        this.price = price;
        this.outboundFlight = outboundFlight;
        this.inboundFlight = inboundFlight;
        getCachedInfo();
    }

    private void getCachedInfo() {
        try {
            Thread.sleep(FlightRecommendationParser.CACHE_DELAY);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return price + "€ , [" + outboundFlight + ", " + inboundFlight + "]";
    }
}

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
