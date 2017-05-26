package com.hightechware.training.codility.lessons;

import java.util.Date;

/**
 * Created by amotos_odigeo on 17/05/2017.
 */
public class BinaryGap {

    public static void main(String[] args) {
        int N = 9;
        Date init = new Date();
        System.out.println("Solution: " + new BinaryGap().solution(N) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        N = 529;
        init = new Date();
        System.out.println("Solution: " + new BinaryGap().solution(N) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        N = 20;
        init = new Date();
        System.out.println("Solution: " + new BinaryGap().solution(N) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        N = 15;
        init = new Date();
        System.out.println("Solution: " + new BinaryGap().solution(N) + " execution time (ms): " + (new Date().getTime() - init.getTime()));
    }

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
