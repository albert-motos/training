package com.hightechware.training.codility.lessons.countingElements;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MissingIntegerTest extends MissingInteger {

    @Test
    public void testSolution() throws Exception {
        assertEquals(5, solution(new int[]{1, 3, 6, 4, 1, 2}), "testSolution_case1");
        assertEquals(6, solution(new int[]{-1, 3, -6, 4, 1, 2, 5}), "testSolution_case2");
    }

}