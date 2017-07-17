package com.hightechware.training.codility.lessons.prefixSums;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CountDivTest extends CountDiv {

    @Test
    public void testSolution() {
        assertEquals(3, solution(6, 11, 2), "testSolution_case1");
    }

}