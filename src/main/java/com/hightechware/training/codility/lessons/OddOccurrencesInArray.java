package com.hightechware.training.codility.lessons;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by amotos_odigeo on 17/05/2017.
 */
public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Date init = new Date();
        System.out.println("Solution: " + new OddOccurrencesInArray().solution(A) + " execution time (ms): " + (new Date().getTime() - init.getTime()));
    }

    public int solution(int[] A) {
        Set<Integer> result = new HashSet<Integer>();

        for (int a : A) {
            if (result.contains(a)) {
                result.remove(a);
            } else {
                result.add(a);
            }
        }

        return result.iterator().next();
    }

}
