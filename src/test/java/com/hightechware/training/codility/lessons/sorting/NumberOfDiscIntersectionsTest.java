package com.hightechware.training.codility.lessons.sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfDiscIntersectionsTest extends NumberOfDiscIntersections {

    @Test
    public void MaxProductOfThree_Solution_True_Case1() {
        Assert.assertEquals(11, solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case1() {
        Assert.assertNotEquals(-1, solution(new int[]{1, 5, 2, 1, 4, 0}));
    }

}