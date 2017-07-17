package com.hightechware.training.codility.lessons.timeComplexity;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TapeEquilibriumTest extends TapeEquilibrium {

    @Test
    public void testSolution() throws Exception {
        assertEquals(1, solution(new int[]{3, 1, 2, 4, 3}), "testSolution_case1");
        assertEquals(0, solution(new int[]{1, 1}), "testSolution_case2");
        assertEquals(2000, solution(new int[]{-1000, 1000}), "testSolution_case3");
        assertEquals(4, solution(new int[]{5, 6, 2, 4, 1}), "testSolution_case4");
    }

}