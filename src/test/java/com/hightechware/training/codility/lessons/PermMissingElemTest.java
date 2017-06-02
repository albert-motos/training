package com.hightechware.training.codility.lessons;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTest extends PermMissingElem {

    int[] CASE_1 = {2, 3, 1, 5};
    int SOLUTION_1 = 4;

    int[] CASE_2 = {};
    int SOLUTION_2 = 1;

    int[] CASE_3 = {1};
    int SOLUTION_3 = 2;

    @Test
    public void PermMissingElem_Solution_True_Case1() {
        assertEquals(SOLUTION_1, solution(CASE_1));
    }

    @Test
    public void PermMissingElem_Solution_False_Case1() {
        assertNotEquals(-1, solution(CASE_1));
    }

    @Test
    public void PermMissingElem_Solution_True_Case2() {
        assertEquals(SOLUTION_2, solution(CASE_2));
    }

    @Test
    public void PermMissingElem_Solution_False_Case2() {
        assertNotEquals(-1, solution(CASE_2));
    }


    @Test
    public void PermMissingElem_Solution_True_Case3() {
        assertEquals(SOLUTION_3, solution(CASE_3));
    }

    @Test
    public void PermMissingElem_Solution_False_Case3() {
        assertNotEquals(-1, solution(CASE_3));
    }
}