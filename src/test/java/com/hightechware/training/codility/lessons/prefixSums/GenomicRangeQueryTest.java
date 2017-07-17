package com.hightechware.training.codility.lessons.prefixSums;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GenomicRangeQueryTest extends GenomicRangeQuery {

    @Test
    public void testSolution() {
        assertEquals(new int[]{2, 4, 1}, solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}), "testSolution_case1");
    }

}