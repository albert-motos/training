package com.hightechware.training.codility.lessons.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProductOfThreeTest extends MaxProductOfThree {

    @Test
    public void MaxProductOfThree_Solution_True_Case1() {
        assertEquals(60, solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case1() {
        assertNotEquals(0, solution(new int[]{-3, 1, 2, -2, 5, 6}));
    }

}