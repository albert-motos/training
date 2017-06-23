package com.hightechware.training.codility.lessons.countingElements;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest extends MissingInteger {

    int[] CASE_1 = {1, 3, 6, 4, 1, 2};

    @Test
    public void MissingInteger_Solution_True_Case1() {
        assertEquals(5, solution(CASE_1));
    }

    @Test
    public void MissingInteger_Solution_False_Case1() {
        assertNotEquals(-1, solution(CASE_1));
    }

    int[] CASE_2 = {-1, 3, -6, 4, 1, 2, 5};

    @Test
    public void MissingInteger_Solution_True_Case2() {
        assertEquals(6, solution(CASE_2));
    }

    @Test
    public void MissingInteger_Solution_False_Case2() {
        assertNotEquals(-1, solution(CASE_2));
    }

}