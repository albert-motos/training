package com.hightechware.training.codility.lessons.prefixSums;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MinAvgTwoSliceTest extends MinAvgTwoSlice {

    @Test
    public void testSolution() throws Exception {
        assertEquals(1, solution(new int[]{4, 2, 2, 5, 1, 5, 8}), "testSolution_case1");
        assertEquals(1, solution(new int[]{4, 2, 2}), "testSolution_case2");
    }

}