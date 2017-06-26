package com.hightechware.training.codility.lessons.countingElements;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxCountersTest extends MaxCounters {

    int[] CASE_A_1 = {3, 4, 4, 6, 1, 4, 4};
    int CASE_N_1 = 5;
    int[] RESULT_1 = {3, 2, 2, 4, 2};

    @Test
    public void MaxCounters_Solution_True_Case1() {
        assertArrayEquals(RESULT_1, solution(CASE_N_1, CASE_A_1));
    }

    @Test
    public void MaxCounters_Solution_False_Case1() {
        assertNotEquals(new int[0], solution(CASE_N_1, CASE_A_1));
    }

}