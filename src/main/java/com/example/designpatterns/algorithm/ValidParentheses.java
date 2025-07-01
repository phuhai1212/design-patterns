package com.example.designpatterns.algorithm;

import java.util.*;

public class ValidParentheses {
    public static boolean checkValidParentheses(String s){
        Stack<Character> lastBracket = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                lastBracket.push(s.charAt(i));
            } else {
                if (lastBracket.empty()) {
                    return false;
                } else {
                    if (s.charAt(i) == ')') {
                        if (lastBracket.pop() != '(') return false;
                    } else if (s.charAt(i) == ']') {
                        if (lastBracket.pop() != '[') return false;
                    } else if (s.charAt(i) == '}') {
                        if (lastBracket.pop() != '{') return false;
                    }
                }
            }
        }
        return lastBracket.empty();
    }

}
