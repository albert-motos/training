package com.hightechware.training.codility.lessons.timeComplexity;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PermMissingElemTest extends PermMissingElem {

    @Test
    public void testSolution() throws Exception {
        assertEquals(4, solution(new int[]{2, 3, 1, 5}), "testSolution_case1");
        assertEquals(1, solution(new int[]{}), "testSolution_case2");
        assertEquals(2, solution(new int[]{1}), "testSolution_case3");
    }

}