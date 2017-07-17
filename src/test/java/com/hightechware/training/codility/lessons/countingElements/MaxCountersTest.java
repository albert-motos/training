package com.hightechware.training.codility.lessons.countingElements;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxCountersTest extends MaxCounters {

    @Test
    public void testSolution() {
        assertEquals(new int[]{3, 2, 2, 4, 2}, solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}), "testSolution_case1");
    }

}