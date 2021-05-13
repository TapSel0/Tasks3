package com.company;

public class Task4 {
    public static String task4 (String string){
        if(string.length() < 2)
            return "Incompatible.";

        if(string.charAt(0) == string.charAt(string.length()-1))
            return "Two's a pair.";

        char[] chars = string.toCharArray();
        char a = chars[0];
        chars[0] = chars[string.length()-1];
        chars[string.length()-1] = a;
        return String.valueOf(chars);
    }
}
