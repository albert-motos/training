package com.hightechware.training.codility.lessons.prefixSums;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinAvgTwoSliceTest extends MinAvgTwoSlice {

    @Test
    public void MinAvgTwoSlice_Solution_True_Case1() {
        assertEquals(1, solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

    @Test
    public void MinAvgTwoSlice_Solution_False_Case1() {
        assertNotEquals(0, solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }

}