package com.hightechware.training.odigeo.challenges.challenge_2;

import javafx.util.Pair;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albert-motos on 14/07/2017.
 */
public class FlightRecommendationParserTest extends FlightRecommendationParser {

    @Test
    public void performanceTest() {
        List<Pair<String, Long>> times = new ArrayList<>();
        times.add(new Pair<String, Long>("Version_0", new FlightRecommendationParser().executeParseRecommendation()));

        for (Pair<String, Long> time : times) {
            System.out.println(time);
            Assert.assertTrue(times.get(0).getValue() <= time.getValue());
        }
    }


}