package com.company;

import java.util.HashSet;

public class Task6 {
    public static boolean task6(int[] arr1, int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i: arr1) {
            set1.add(i);
        }

        for (int j: arr2) {
            set2.add(j);
        }

        return set1.size() == set2.size();
    }
}
