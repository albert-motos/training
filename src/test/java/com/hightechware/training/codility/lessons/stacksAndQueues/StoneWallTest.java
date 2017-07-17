package com.hightechware.training.codility.lessons.stacksAndQueues;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StoneWallTest extends StoneWall {

    @Test
    public void testSolution() {
        assertEquals(7, solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8,}), "testSolution_case1");
    }

}