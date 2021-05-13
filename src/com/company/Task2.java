package com.company;

public class Task2 {
    public static int task2 (String string){
        if (string.lastIndexOf("zip") != string.indexOf("zip") && string.indexOf("zip") != -1)
            return string.lastIndexOf("zip");
        return -1;
    }
}
