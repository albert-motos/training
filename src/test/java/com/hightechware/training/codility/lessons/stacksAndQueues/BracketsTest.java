package com.hightechware.training.codility.lessons.stacksAndQueues;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BracketsTest extends Brackets {

    @Test
    public void MaxProductOfThree_Solution_True_Case1() {
        Assert.assertEquals(1, solution("{[()()]}"));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case1() {
        Assert.assertNotEquals(0, solution("{[()()]}"));
    }

    @Test
    public void MaxProductOfThree_Solution_True_Case2() {
        Assert.assertEquals(0, solution("([)()]"));
    }

    @Test
    public void MaxProductOfThree_Solution_False_Case2() {
        Assert.assertNotEquals(1, solution("([)()]"));
    }

}