package com.example.designpatterns.algorithm;

public class ReverseString {
    public static String reverseString(String s){
        return reverseStringNotUsingStringBuilder(s);
    }

    public static String revereStringUsingLibrary(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseStringManually(String s){
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static String reverseStringNotUsingStringBuilder(String s){
        String results = "";
        for (int i = s.length() - 1; i >= 0; i--){
            results += s.charAt(i);
        }
        return results;
    }
}
