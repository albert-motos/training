package com.hightechware.training.odigeo.challenges.challenge_2;

import org.testng.annotations.Test;

/**
 * Created by albert-motos on 14/07/2017.
 */
public class FlightRecommendationParserTest {

    @Test
    public void performanceTest() {
        Long time_version0 = new FlightRecommendationParser().executeParseRecommendation();
    }

}