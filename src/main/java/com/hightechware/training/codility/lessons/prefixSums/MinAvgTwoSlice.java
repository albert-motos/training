package com.hightechware.training.codility.lessons.prefixSums;

/**
 * A non-empty zero-indexed array A consisting of N integers is given. A pair of integers (P, Q), such that
 * 0 ≤ P < Q < N, is called a slice of array A (notice that the slice contains at least two elements). The average of
 * a slice (P, Q) is the sum of A[P] + A[P + 1] + ... + A[Q] divided by the length of the slice. To be precise, the
 * average equals (A[P] + A[P + 1] + ... + A[Q]) / (Q − P + 1).
 * <p/>
 * For example, array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 2
 * A[2] = 2
 * A[3] = 5
 * A[4] = 1
 * A[5] = 5
 * A[6] = 8
 * contains the following example slices:
 * <p/>
 * slice (1, 2), whose average is (2 + 2) / 2 = 2;
 * slice (3, 4), whose average is (5 + 1) / 2 = 3;
 * slice (1, 4), whose average is (2 + 2 + 5 + 1) / 4 = 2.5.
 * The goal is to find the starting position of a slice whose average is minimal.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int[] A); }
 * that, given a non-empty zero-indexed array A consisting of N integers, returns the starting position of the slice
 * with the minimal average. If there is more than one slice with a minimal average, you should return the smallest
 * starting position of such a slice.
 * <p/>
 * For example, given array A such that:
 * <p/>
 * A[0] = 4
 * A[1] = 2
 * A[2] = 2
 * A[3] = 5
 * A[4] = 1
 * A[5] = 5
 * A[6] = 8
 * the function should return 1, as explained above.
 * <p/>
 * Assume that:
 * <p/>
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−10,000..10,000].
 * Complexity:
 * <p/>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input
 * arguments).
 * Elements of input arrays can be modified.
 */
public class MinAvgTwoSlice {

    public int solution(int[] A) {
        int result = 0;

        int[] sums = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            sums[i + 1] = sums[i] + A[i];
        }

        if (A.length != 2) {
            float minAvg = Float.MAX_VALUE;
            for (int i = 0; i < A.length - 2; i++) {
                float s2 = (sums[i + 2] - sums[i]) / 2f;
                float s3 = (sums[i + 3] - sums[i]) / 3f;

                float currentAvg = minAvg;
                minAvg = Math.min(minAvg, Math.min(s2, s3));
                if (minAvg != currentAvg) {
                    result = i;
                }
            }

            float s2 = (sums[sums.length - 1] - sums[sums.length - 3]) / 2f;
            if (s2 < minAvg) {
                result = sums.length - 3;
            }
        }

        return result;
    }

}
