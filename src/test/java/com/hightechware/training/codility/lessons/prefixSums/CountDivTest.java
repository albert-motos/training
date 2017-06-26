package com.hightechware.training.codility.lessons.prefixSums;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDivTest extends CountDiv {

    @Test
    public void CountDiv_Solution_True_Case1() {
        assertEquals(3, solution(6, 11, 2));
    }

    @Test
    public void CountDiv_Solution_False_Case1() {
        assertNotEquals(-3, solution(6, 11, 2));
    }

}