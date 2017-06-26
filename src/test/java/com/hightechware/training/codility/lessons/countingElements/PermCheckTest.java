package com.hightechware.training.codility.lessons.countingElements;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PermCheckTest extends PermCheck {

    int[] CASE_1 = {4, 1, 3, 2};
    int[] CASE_2 = {4, 1, 3};

    @Test
    public void PermCheck_Solution_True_Case1() {
        assertEquals(1, solution(CASE_1));
    }

    @Test
    public void PermCheck_Solution_False_Case1() {
        assertNotEquals(0, solution(CASE_1));
    }

    @Test
    public void PermCheck_Solution_True_Case2() {
        assertEquals(0, solution(CASE_2));
    }

    @Test
    public void PermCheck_Solution_False_Case2() {
        assertNotEquals(1, solution(CASE_2));
    }

}