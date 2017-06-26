package com.hightechware.training.codility.lessons.timeComplexity;

import java.util.HashSet;
import java.util.Set;

/**
 * -------------------------
 * Lesson 3: Time Complexity
 * -------------------------
 * <p/>
 * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range
 * [1..(N + 1)], which means that exactly one element is missing.
 * <p/>
 * Your goal is to find that missing element.
 * <p/>
 * Write a function:
 * <p/>
 * int solution(int A[], int N);
 * <p/>
 * that, given a zero-indexed array A, returns the value of the missing element.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * <p/>
 * the function should return 4, as it is the missing element.
 * <p/>
 * Assume that:
 * <p/>
 * > N is an integer within the range [0..100,000];
 * > the elements of A are all distinct;
 * > each element of array A is an integer within the range [1..(N + 1)].
 * <p/>
 * Complexity:
 * <p/>
 * > expected worst-case time complexity is O(N);
 * > expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for
 * input arguments).
 * <p/>
 * Elements of input arrays can be modified.
 */
public class PermMissingElem {

    public int solution(int[] A) {
        int result = 0;

        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }

        int i = 1;
        while (i <= (A.length + 1) && result == 0) {
            if (!set.contains(i)) {
                result = i;
            } else {
                i++;
            }
        }

        return result;
    }

}
