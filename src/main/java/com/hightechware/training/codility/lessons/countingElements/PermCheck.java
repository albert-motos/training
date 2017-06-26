package com.hightechware.training.codility.lessons.countingElements;

import java.util.HashSet;
import java.util.Set;

/**
 * -------------------------
 * Lesson 4: Counting Elements
 * -------------------------
 * <p/>
 * A non-empty zero-indexed array A consisting of N integers is given.
 * <p/>
 * A permutation is a sequence containing each element from 1 to N once, and only once.
 * <p/>
 * For example, array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * <p/>
 * is a permutation, but array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * <p/>
 * is not a permutation, because value 2 is missing.
 * <p/>
 * The goal is to check whether array A is a permutation.
 * <p/>
 * Write a function:
 * <p/>
 * int solution(int A[], int N);
 * <p/>
 * that, given a zero-indexed array A, returns 1 if array A is a permutation and 0 if it is not.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * A[3] = 2
 * <p/>
 * the function should return 1.
 * <p/>
 * Given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 1
 * A[2] = 3
 * <p/>
 * the function should return 0.
 * <p/>
 * Assume that:
 * <p/>
 * > N is an integer within the range [1..100,000];
 * > each element of array A is an integer within the range [1..1,000,000,000].
 * <p/>
 * Complexity:
 * <p/>
 * > expected worst-case time complexity is O(N);
 * > expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for
 * input arguments).
 * <p/>
 * Elements of input arrays can be modified.
 */
public class PermCheck {

    public int solution(int A[]) {
        int result = 0;

        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }

        int i = 1;
        boolean correctOrder = true;
        while (i <= A.length && correctOrder) {
            correctOrder = set.contains(i);
            i++;
        }

        if (correctOrder) {
            result = 1;
        }

        return result;
    }

}
