package com.company;

public class Task9 {
    public static int task9(int num){
        boolean prime = false;
        while (true) {
            prime = true;
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) prime = false;
            }
            if (prime) return num;
            num++;
        }
    }
}
