package com.hightechware.training.codility.lessons.iterations;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BinaryGapTest extends BinaryGap {

    @Test
    public void testSolution() {
        assertEquals(2, solution(9), "testSolution_case1");
        assertEquals(4, solution(529), "testSolution_case2");
        assertEquals(1, solution(20), "testSolution_case3");
        assertEquals(0, solution(15), "testSolution_case4");
    }

}