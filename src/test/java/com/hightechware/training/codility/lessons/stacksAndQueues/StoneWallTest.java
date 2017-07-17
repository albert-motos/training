package com.hightechware.training.codility.lessons.stacksAndQueues;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StoneWallTest extends StoneWall {

    @Test
    public void testSolution() {
        Assert.assertEquals(7, solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8,}));
    }

}