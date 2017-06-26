package com.hightechware.training.codility.lessons.iterations;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryGapTest extends BinaryGap {

    @Test
    public void BinaryGap_Solution_True_Case1() {
        assertTrue(2 == solution(9));
    }

    @Test
    public void BinaryGap_Solution_False_Case1() {
        assertFalse(-1 == solution(9));
    }

    @Test
    public void BinaryGap_Solution_True_Case2() {
        assertTrue(4 == solution(529));
    }

    @Test
    public void BinaryGap_Solution_False_Case2() {
        assertFalse(-1 == solution(529));
    }

    @Test
    public void BinaryGap_Solution_True_Case3() {
        assertTrue(1 == solution(20));
    }

    @Test
    public void BinaryGap_Solution_False_Case3() {
        assertFalse(-1 == solution(20));
    }

    @Test
    public void BinaryGap_Solution_True_Case4() {
        assertTrue(0 == solution(15));
    }

    @Test
    public void BinaryGap_Solution_False_Case4() {
        assertFalse(-1 == solution(15));
    }

}