package com.company;

public class Task7 {
    public static boolean task7(int a){
        String result = String.valueOf((int) Math.pow(a, 2));
        int num1, num2 = 0;
        if (result.length() == 1)
            num1 = 0;
        else {
            num1 = Integer.parseInt(result.substring(0, (int) (result.length() / 2)));
            num2 = Integer.parseInt(result.substring((int) (result.length() / 2)));
        }
        return (num1 + num2 == a);
    }
}
