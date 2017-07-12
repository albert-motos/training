package com.hightechware.training.codility.lessons.sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest extends Triangle {

    @Test
    public void MaxProductOfThree_Solution_True_Case1() {
        Assert.assertEquals(1, solution(new int[]{10, 2, 5, 1, 8, 20}));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case1() {
        Assert.assertNotEquals(0, solution(new int[]{10, 2, 5, 1, 8, 20}));
    }

    @Test
    public void MaxProductOfThree_Solution_True_Case2() {
        Assert.assertEquals(0, solution(new int[]{10, 50, 5, 1}));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case2() {
        Assert.assertNotEquals(1, solution(new int[]{10, 50, 5, 1}));
    }

    @Test
    public void MaxProductOfThree_Solution_True_Case3() {
        Assert.assertEquals(1, solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case3() {
        Assert.assertNotEquals(0, solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE}));
    }

}