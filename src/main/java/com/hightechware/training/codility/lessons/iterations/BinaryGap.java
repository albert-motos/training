package com.hightechware.training.codility.lessons.iterations;

/**
 * --------------------
 * Lesson 1: Iterations
 * --------------------
 * <p/>
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
 * both ends in the binary representation of N.
 * <p/>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has
 * binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20
 * has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation
 * 1111 and has no binary gaps.
 * <p/>
 * Write a function:
 * <p/>
 * class Solution { public int solution(int N); }
 * <p/>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N
 * doesn't contain a binary gap.
 * <p/>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so
 * its longest binary gap is of length 5.
 * <p/>
 * Assume that:
 * <p/>
 * > N is an integer within the range [1..2,147,483,647].
 * <p/>
 * Complexity:
 * <p/>
 * > expected worst-case time complexity is O(log(N));
 * > expected worst-case space complexity is O(1).
 */
public class BinaryGap {

    public int solution(int N) {
        int result = 0;

        if (N > 0) {
            String binary = int2binary(N);

            int i = 0;
            int j = 1;

            while (j < binary.length()) {
                if (binary.charAt(i) == binary.charAt(j)) {
                    if ((j - i - 1) > result) {
                        result = j - i - 1;
                    }
                    i = j;
                }
                j++;
            }
        }

        return result;
    }

    private String int2binary(int n) {
        String result;

        if (n < 2) {
            result = String.valueOf(n % 2);
        } else {
            result = int2binary(n / 2) + (n % 2);
        }

        return result;
    }

}
