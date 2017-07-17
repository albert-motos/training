package com.hightechware.training.codility.lessons.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A zero-indexed array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N
 * and:
 * <p>
 * A[P] + A[Q] > A[R], A[Q] + A[R] > A[P], A[R] + A[P] > A[Q]. For example, consider array A such that:
 * <p>
 * A[0] = 10    A[1] = 2    A[2] = 5 A[3] = 1     A[4] = 8    A[5] = 20 Triplet (0, 2, 4) is triangular.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); } that, given a zero-indexed array A consisting of N integers, returns
 * 1 if there exists a triangular triplet for this array and returns 0 otherwise.
 * <p>
 * For example, given array A such that:
 * <p>
 * A[0] = 10    A[1] = 2    A[2] = 5 A[3] = 1     A[4] = 8    A[5] = 20 the function should return 1, as explained
 * above. Given array A such that:
 * <p>
 * A[0] = 10    A[1] = 50    A[2] = 5 A[3] = 1 the function should return 0.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..100,000]; each element of array A is an integer within the range
 * [−2,147,483,648..2,147,483,647]. Complexity:
 * <p>
 * expected worst-case time complexity is O(N*log(N)); expected worst-case space complexity is O(N), beyond input
 * storage (not counting the storage required for input arguments). Elements of input arrays can be modified.
 */
public class Triangle {

    public int solution(int[] A) {
        int result = 0;

        if (A.length > 2) {
            List<Long> list = new ArrayList<>();
            for (int a : A) {
                list.add((long) a);
            }

            Collections.sort(list);

            int index = list.size() - 1;

            while (index > 1 && result == 0) {
                if (list.get(index - 2) + list.get(index - 1) > list.get(index)) {
                    result = 1;
                } else {
                    index--;
                }
            }
        }

        return result;
    }

}
