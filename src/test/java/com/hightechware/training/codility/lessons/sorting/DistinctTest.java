package com.hightechware.training.codility.lessons.sorting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DistinctTest extends Distinct {

    @Test
    public void testSolution() throws Exception {
        assertEquals(3, solution(new int[]{2, 1, 1, 2, 3, 1}), "testSolution_case1");
    }

}