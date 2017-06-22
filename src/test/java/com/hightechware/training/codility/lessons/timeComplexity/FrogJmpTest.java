package com.hightechware.training.codility.lessons.timeComplexity;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJmpTest extends FrogJmp {

    int CASE_1_X = 10;
    int CASE_1_Y = 85;
    int CASE_1_D = 30;
    int SOLUTION_1 = 3;

    @Test
    public void FrogJmp_Solution_True_Case1() {
        assertEquals(SOLUTION_1, solution(CASE_1_X, CASE_1_Y, CASE_1_D));
    }

    @Test
    public void FrogJmp_Solution_False_Case1() {
        assertNotEquals(null, solution(CASE_1_X, CASE_1_Y, CASE_1_D));
    }

}