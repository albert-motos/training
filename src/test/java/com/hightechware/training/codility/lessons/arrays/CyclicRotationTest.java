package com.hightechware.training.codility.lessons.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTest extends CyclicRotation {

    int[] CASE_1 = {3, 8, 9, 7, 6};
    int CASE_1_K = 3;
    int[] SOLUTION_1 = {9, 7, 6, 3, 8};

    int[] CASE_2 = {};
    int CASE_2_K = 1;
    int[] SOLUTION_2 = {};

    int[] CASE_3 = {3, 8, 9, 7, 6};
    int CASE_3_K = 6;
    int[] SOLUTION_3 = {6, 3, 8, 9, 7};

    @Test
    public void CyclicRotation_Solution_True_Case1() {
        assertArrayEquals(SOLUTION_1, solution(CASE_1, CASE_1_K));
    }

    @Test
    public void CyclicRotation_Solution_True_Case2() {
        assertArrayEquals(SOLUTION_2, solution(CASE_2, CASE_2_K));
    }

    @Test
    public void CyclicRotation_Solution_True_Case3() {
        assertArrayEquals(SOLUTION_3, solution(CASE_3, CASE_3_K));
    }

}