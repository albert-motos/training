package com.hightechware.training.codility.lessons.sorting;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TriangleTest extends Triangle {

    @Test
    public void testSolution() throws Exception {
        assertEquals(1, solution(new int[]{10, 2, 5, 1, 8, 20}), "testSolution_case1");
        assertEquals(0, solution(new int[]{10, 50, 5, 1}), "testSolution_case2");
        assertEquals(1, solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}), "testSolution_case3");
    }

}