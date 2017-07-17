package com.hightechware.training.codility.lessons.stacksAndQueues;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BracketsTest extends Brackets {

    @Test
    public void testSolution() {
        assertEquals(1, solution("{[()()]}"), "testSolution_case1");
        assertEquals(0, solution("([)()]"), "testSolution_case2");
        assertEquals(0, solution("]"), "testSolution_case3");
    }

}