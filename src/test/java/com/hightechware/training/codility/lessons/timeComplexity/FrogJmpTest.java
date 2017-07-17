package com.hightechware.training.codility.lessons.timeComplexity;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrogJmpTest extends FrogJmp {

    @Test
    public void testSolution() throws Exception {
        assertEquals(3, solution(10, 85, 30), "testSolution_case1");
    }

}