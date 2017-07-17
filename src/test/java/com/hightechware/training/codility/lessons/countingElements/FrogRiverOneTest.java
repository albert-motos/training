package com.hightechware.training.codility.lessons.countingElements;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrogRiverOneTest extends FrogRiverOne {

    @Test
    public void testSolution() {
        assertEquals(6, solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}), "testSolution_case1");
        assertEquals(-1, solution(2, new int[]{2, 2, 2, 2, 2}), "testSolution_case2");
        assertEquals(4, solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}), "testSolution_case3");
    }

}