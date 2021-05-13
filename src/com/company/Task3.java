package com.company;

public class Task3 {
    public static boolean task3(int num){
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
            if (sum > num)
                return false;
        }
        return (sum == num);
    }
}
