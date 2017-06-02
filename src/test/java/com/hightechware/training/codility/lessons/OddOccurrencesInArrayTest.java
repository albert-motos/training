package com.hightechware.training.codility.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTest extends OddOccurrencesInArray {

    int[] CASE_1 = {9, 3, 9, 3, 9, 7, 9};
    int SOLUTION_1 = 7;

    @Test
    public void OddOccurrencesInArray_Solution_True_Case1() {
        assertTrue(SOLUTION_1 == solution(CASE_1));
    }

    @Test
    public void OddOccurrencesInArray_Solution_False_Case1() {
        assertFalse(SOLUTION_1 != solution(CASE_1));
    }

}