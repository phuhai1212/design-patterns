package com.example.designpatterns.algorithm.easy;

import java.util.Stack;

public class P0844BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        return removeBackspace(s).equals(removeBackspace(t));
    }

    private static String removeBackspace(String s){
        Stack<Character> result = new Stack<>();
        for (Character c : s.toCharArray()){
            if (c != '#'){
                result.push(c);
            } else if (!result.isEmpty()){
                result.pop();
            }
        }
        return String.valueOf(result);
    }

    private static String removeBackspaceV2(String s){
        Stack<Character> result = new Stack<>();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != '#' && count == 0){
                result.push(s.charAt(i));
            } else if (s.charAt(i) == '#'){
                count++;
            } else {
                count--;
            }
        }
        return String.valueOf(result);
    }

    public static boolean backspaceCompareV2(String s, String t) {
        int si = s.length() - 1;
        int ti = t.length() - 1;
        int st = 0;
        int tt = 0;
        while ((si >= 0 && st >= 0) || (ti >= 0 && tt >= 0)){
            if (si >= 0 && s.charAt(si) == '#'){
                st++;
            } else {
                st--;
            }
            if (ti >= 0 && t.charAt(ti) == '#'){
                tt++;
            } else {
                tt--;
            }

            if (st >= 0 && tt >= 0){
                si--;
                ti--;
            } else if (st >= 0){
                si--;
            } else if (tt >= 0){
                ti--;
            } else {
                if (s.charAt(si) != t.charAt(ti)){
                    return false;
                } else {
                    tt = 0;
                    st = 0;
                    si--;
                    ti--;
                }
            }
        }
        if (si < 0 && ti < 0){
            return true;
        }
        return ti == si;
    }
}
