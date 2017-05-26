package com.hightechware.training.codility.lessons;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by amotos_odigeo on 17/05/2017.
 */
public class PermMissingElem {

    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        Date init = new Date();
        System.out.println("Solution: " + new PermMissingElem().solution(A) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        A = new int[]{};
        init = new Date();
        System.out.println("Solution: " + new PermMissingElem().solution(A) + " execution time (ms): " + (new Date().getTime() - init.getTime()));

        A = new int[]{1};
        init = new Date();
        System.out.println("Solution: " + new PermMissingElem().solution(A) + " execution time (ms): " + (new Date().getTime() - init.getTime()));
    }

    public int solution(int[] A) {
        int result = 0;

        Set<Integer> set = new HashSet<Integer>();
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
