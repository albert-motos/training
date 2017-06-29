package com.hightechware.training.codility.lessons.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTest extends Distinct {

    @Test
    public void Distinct_Solution_True_Case1() {
        assertEquals(3, solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

    @Test
    public void Distinct_Solution_False_Case1() {
        assertNotEquals(0, solution(new int[]{2, 1, 1, 2, 3, 1}));
    }

}