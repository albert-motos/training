package com.hightechware.training.codility.lessons.countingElements;

import java.util.HashSet;
import java.util.Set;

/**
 * -------------------------
 * Lesson 4: Counting Elements
 * -------------------------
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * <p/>
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal positive integer (greater than 0)
 * that does not occur in A.
 * <p/>
 * For example, given:
 * <p/>
 * A[0] = 1
 * A[1] = 3
 * A[2] = 6
 * A[3] = 4
 * A[4] = 1
 * A[5] = 2
 * <p/>
 * the function should return 5.
 * <p/>
 * Assume that:
 * <p/>
 * > N is an integer within the range [1..100,000];
 * > each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 * <p/>
 * Complexity:
 * <p/>
 * > expected worst-case time complexity is O(N);
 * > expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for
 * input arguments).
 * <p/>
 * Elements of input arrays can be modified.
 */
public class MissingInteger {

    public int solution(int[] A) {
        int result = 1;

        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            set.add(a);
        }

        while (set.contains(result)) {
            result++;
        }

        return result;
    }

}
