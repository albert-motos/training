package com.hightechware.training.codility.lessons.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CyclicRotationTest extends CyclicRotation {

    @Test
    public void testSolution() {
        assertEquals(new int[]{9, 7, 6, 3, 8}, solution(new int[]{3, 8, 9, 7, 6}, 3), "testSolution_case1");
        assertEquals(new int[]{}, solution(new int[]{}, 1), "testSolution_case2");
        assertEquals(new int[]{6, 3, 8, 9, 7}, solution(new int[]{3, 8, 9, 7, 6}, 6), "testSolution_case3");
    }

}