package com.company;

import java.util.Arrays;

public class Task8 {
    public static String task8(String string){
        try {
            String[] split = string.split("1+");
            Arrays.sort(split);
            return split[split.length-1];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "";
        }
    }
}
