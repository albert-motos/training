package com.hightechware.training.odigeo.challenges.challenge_2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FlightRecommendationParserTest {

    private FlightRecommendationStorage flightRecommendationStorage;

    @BeforeTest
    private void init() {
        flightRecommendationStorage = new FlightRecommendationStorage();
    }

    @Test
    public void performanceTest() {


        Long time_version0 = new FlightRecommendationParser_v0(flightRecommendationStorage).executeParseRecommendation();
        Long time_version1 = new FlightRecommendationParser_v1(flightRecommendationStorage).executeParseRecommendation();

        System.out.println("time_v0: " + time_version0);
        System.out.println("time_v1: " + time_version1);

        assertTrue(time_version1 < time_version0, "Version_1 (maps) doesn't improve performance");
    }

    @Test
    public void coverageTest() {
        ParsedFlight parsedFlight = new ParsedFlight(1, "of", "if");
        assertEquals(parsedFlight.toString(), "1€ , [of, if]");

        Thread.currentThread().interrupt();
        new ParsedFlight(1, "of", "if");

        Object response = null;

        Method method;
        try {
            method = FlightRecommendationParser_v0.class.getDeclaredMethod("parseFlight", List.class, int.class);
            method.setAccessible(true);
            response = method.invoke(new FlightRecommendationParser_v0(flightRecommendationStorage), new ArrayList<Flight>(), -1);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

        assertTrue(response instanceof String);
        assertTrue("".equals(response));
    }

}