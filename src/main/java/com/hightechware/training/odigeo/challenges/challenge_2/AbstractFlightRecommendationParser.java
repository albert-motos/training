package com.hightechware.training.odigeo.challenges.challenge_2;

import java.util.List;

abstract class AbstractFlightRecommendationParser implements FlightRecommendationParser {

    static int FLIGHT_NUM = 100000;
    static int RECO_NUM = 10000;
    static int CACHE_DELAY = 2;

    List<FlightRecommendation> flightRecommendations;

}
