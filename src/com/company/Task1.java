package com.company;

public class Task1 {
    public static int task1(int a, int b, int c){
        double discriminant = b*b - 4*a*c;
        if (discriminant == 0) {
            return 1;
        } else if (discriminant < 0) {
            return 0;
        } else {
            return 2;
        }
    }
}
