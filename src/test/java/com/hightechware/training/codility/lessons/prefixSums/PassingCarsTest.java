package com.hightechware.training.codility.lessons.prefixSums;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PassingCarsTest extends PassingCars {

    @Test
    public void testSolution() throws Exception {
        assertEquals(5, solution(new int[]{0, 1, 0, 1, 1}), "testSolution_case1");

        int[] case2 = new int[100000];
        for (int i = 0; i < case2.length; i += 2) {
            case2[i] = 1;
        }
        assertEquals(-1, solution(case2), "testSolution_case2");
    }

}