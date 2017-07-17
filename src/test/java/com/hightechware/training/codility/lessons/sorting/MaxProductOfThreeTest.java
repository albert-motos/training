package com.hightechware.training.codility.lessons.sorting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MaxProductOfThreeTest extends MaxProductOfThree {

    @Test
    public void testSolution() throws Exception {
        assertEquals(60, solution(new int[]{-3, 1, 2, -2, 5, 6}), "testSolution_case1");
    }

}