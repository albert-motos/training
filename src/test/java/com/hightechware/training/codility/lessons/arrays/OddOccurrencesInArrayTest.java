package com.hightechware.training.codility.lessons.arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class OddOccurrencesInArrayTest extends OddOccurrencesInArray {

    @Test
    public void testSolution() {
        assertEquals(7, solution(new int[]{9, 3, 9, 3, 9, 7, 9}), "testSolution_case1");
    }

}