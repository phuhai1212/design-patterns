package com.example.designpatterns.algorithm.medium;

import java.util.Stack;

public class StringMaximumScoreRemovingSubstrings {
    public static int maximumGain(String s, int x, int y) {
        if (s.length() < 2){
            return 0;
        }
        if (x > y){
            return solve(s, "ab", "ba", x, y);
        } else {
            return solve(s, "ba", "ab", y, x);
        }

    }

    private static int solve(String s, String highPair, String lowPair, int h, int l){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int gain = 0;
        gain += getGain(s, highPair, h, stack);
        if (stack.empty()){
            return gain;
        }
        StringBuilder remaining = new StringBuilder();
        while (!stack.empty()){
            remaining.append(stack.pop());
        }
        String newStr = remaining.reverse().toString();
        stack.push(newStr.charAt(0));
        gain += getGain(newStr, lowPair, l, stack);
        return gain;
    }

    private static int getGain(String s, String pair, int score, Stack<Character> stack) {
        int gain = 0;
        for (int i = 1; i < s.length(); i++){
            if (!stack.empty() && isEqual(pair, stack.peek(), s.charAt(i))){
                gain += score;
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        return gain;
    }

    private static boolean isEqual(String s, Character c1, Character c2){
        return c1.equals(s.charAt(0)) && c2.equals(s.charAt(1));
    }

}
