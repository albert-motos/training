package com.hightechware.training.codility.lessons.prefixSums;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PassingCarsTest extends PassingCars {

    @Test
    public void CountDiv_Solution_True_Case1() {
        assertEquals(5, solution(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void CountDiv_Solution_False_Case1() {
        assertNotEquals(-5, solution(new int[]{0, 1, 0, 1, 1}));
    }

}