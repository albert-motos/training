package com.hightechware.training.codility.lessons.prefixSums;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenomicRangeQueryTest extends GenomicRangeQuery {

    @Test
    public void GenomicRangeQuery_Solution_True_Case1() {
        assertArrayEquals(new int[]{2, 4, 1}, solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}));
    }

}