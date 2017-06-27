package com.hightechware.training.codility.lessons.prefixSums;

import org.junit.Test;

import static org.junit.Assert.*;

public class PassingCarsTest extends PassingCars {

    @Test
    public void CountDiv_Solution_True_Case1() {
        assertEquals(5, solution(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void CountDiv_Solution_False_Case1() {
        assertNotEquals(-5, solution(new int[]{0, 1, 0, 1, 1}));
    }

    int[] CASE_2 = new int[1_000_000];

    @Test
    public void CountDiv_Solution_True_Case2() {
        assertEquals(-1, solution(CASE_2));
    }

    @Test
    public void CountDiv_Solution_False_Case2() {
        assertNotEquals(0, solution(CASE_2));
    }

}