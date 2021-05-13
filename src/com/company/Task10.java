package com.company;

import java.util.Arrays;

public class Task10 {
    public static boolean task10(int x, int y, int z){
        int[] arr = {x, y, z};
        Arrays.sort(arr);
        return (Math.sqrt(Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == arr[2]);
    }
}
