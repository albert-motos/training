package com.hightechware.training.codility.lessons.sorting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberOfDiscIntersectionsTest extends NumberOfDiscIntersections {

    @Test
    public void testSolution() throws Exception {
        assertEquals(11, solution(new int[]{1, 5, 2, 1, 4, 0}), "testSolution_case1");
    }

}