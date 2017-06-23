package com.hightechware.training.codility.lessons.countingElements;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogRiverOneTest extends FrogRiverOne {

    int[] CASE_A_1 = {1, 3, 1, 4, 2, 3, 5, 4};
    int CASE_X_1 = 5;

    @Test
    public void FrogRiverOne_Solution_True_Case1() {
        assertEquals(6, solution(CASE_X_1, CASE_A_1));
    }

    @Test
    public void FrogRiverOne_Solution_False_Case1() {
        assertNotEquals(-1, solution(CASE_X_1, CASE_A_1));
    }

    int[] CASE_A_2 = {2, 2, 2, 2, 2};
    int CASE_X_2 = 2;

    @Test
    public void FrogRiverOne_Solution_True_Case2() {
        assertEquals(-1, solution(CASE_X_2, CASE_A_2));
    }

    @Test
    public void FrogRiverOne_Solution_False_Case2() {
        assertNotEquals(0, solution(CASE_X_1, CASE_A_1));
    }

    int[] CASE_A_3 = {1, 3, 1, 3, 2, 1, 3};
    int CASE_X_3 = 3;

    @Test
    public void FrogRiverOne_Solution_True_Case3() {
        assertEquals(4, solution(CASE_X_3, CASE_A_3));
    }

    @Test
    public void FrogRiverOne_Solution_False_Case3() {
        assertNotEquals(-1, solution(CASE_X_3, CASE_A_3));
    }

}