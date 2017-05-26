package com.hightechware.training.codility.lessons;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by amotos_odigeo on 17/05/2017.
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int k = 3;
        Date init = new Date();
        System.out.println("Solution: " + Arrays.toString(new CyclicRotation().solution(A, k)) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        A = new int[]{};
        k = 1;
        init = new Date();
        System.out.println("Solution: " + Arrays.toString(new CyclicRotation().solution(A, k)) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        A = new int[]{3, 8, 9, 7, 6};
        k = 6;
        init = new Date();
        System.out.println("Solution: " + Arrays.toString(new CyclicRotation().solution(A, k)) + " execution time (ms): " + (new Date().getTime() - init.getTime()));
    }

    public int[] solution(int[] A, int K) {
        int[] result = new int[A.length];

        if (A.length > 0) {
            int i = A.length - (K % A.length);
            int j = 0;

            while (i < A.length) {
                result[j] = A[i];
                i++;
                j++;
            }

            i = 0;
            while (i < A.length - (K % A.length)) {
                result[j] = A[i];
                i++;
                j++;
            }
        }

        return result;
    }

}
