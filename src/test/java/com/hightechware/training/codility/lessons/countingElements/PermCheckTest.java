package com.hightechware.training.codility.lessons.countingElements;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PermCheckTest extends PermCheck {

    @Test
    public void testSolution() {
        assertEquals(1, solution(new int[]{4, 1, 3, 2}), "testSolution_case1");
        assertEquals(0, solution(new int[]{4, 1, 3}), "testSolution_case2");
    }

}