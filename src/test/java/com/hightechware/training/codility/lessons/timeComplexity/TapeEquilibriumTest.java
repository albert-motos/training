package com.hightechware.training.codility.lessons.timeComplexity;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TapeEquilibriumTest extends TapeEquilibrium {

    int[] CASE_1 = {3, 1, 2, 4, 3};
    int SOLUTION_1 = 1;
    int[] CASE_2 = {1, 1};
    int SOLUTION_2 = 0;
    int[] CASE_3 = {-1000, 1000};
    int SOLUTION_3 = 2000;
    int[] CASE_4 = {5, 6, 2, 4, 1};
    int SOLUTION_4 = 4;

    @Test
    public void TapeEquilibrium_Solution_True_Case1() {
        assertEquals(SOLUTION_1, solution(CASE_1));
    }

    @Test
    public void TapeEquilibrium_Solution_False_Case1() {
        assertNotEquals(null, solution(CASE_1));
    }

    @Test
    public void TapeEquilibrium_Solution_True_Case2() {
        assertEquals(SOLUTION_2, solution(CASE_2));
    }

    @Test
    public void TapeEquilibrium_Solution_False_Case2() {
        assertNotEquals(null, solution(CASE_2));
    }

    @Test
    public void TapeEquilibrium_Solution_True_Case3() {
        assertEquals(SOLUTION_3, solution(CASE_3));
    }

    @Test
    public void TapeEquilibrium_Solution_False_Case3() {
        assertNotEquals(null, solution(CASE_3));
    }

    @Test
    public void TapeEquilibrium_Solution_True_Case4() {
        assertEquals(SOLUTION_4, solution(CASE_4));
    }

    @Test
    public void TapeEquilibrium_Solution_False_Case4() {
        assertNotEquals(null, solution(CASE_4));
    }

}