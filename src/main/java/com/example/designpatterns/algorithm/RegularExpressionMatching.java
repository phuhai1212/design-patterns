package com.example.designpatterns.algorithm;

public class RegularExpressionMatching {
    public static boolean isMatch(String s, String p) {
        // Base case: if pattern is empty, string must be empty
        if (p.isEmpty()) {
            return s.isEmpty();
        }

        // Check if first characters match (taking into account the '.' wildcard)
        boolean firstMatch = (!s.isEmpty() &&
                (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

        // If the pattern has at least 2 characters and the second character is '*'
        if (p.length() >= 2 && p.charAt(1) == '*') {
            // 1) Skip the "x*" segment in the pattern (zero occurrences)
            // OR
            // 2) If first characters matched, move on in the string (one or more occurrences)
            return isMatch(s, p.substring(2))
                    || (firstMatch && isMatch(s.substring(1), p));
        } else {
            // Otherwise, consume one character from both s and p if they matched
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }
    }


//    public static boolean isMatch(String s, String p){
//        //Handle empty s
//        if (s.isEmpty() && !p.isEmpty()){
//            int pi = 0;
//            while (pi < p.length()){
//                if (pi + 1 < p.length() && p.charAt(pi+1) == '*'){
//                    pi = pi + 2;
//                } else {
//                    return false;
//                }
//            }
//            return true;
//        }
//        int si = 0;
//        int pi = 0;
//
//        while (si < s.length() && pi < p.length()) {
//            if (p.charAt(pi) != '.' && s.charAt(si) != p.charAt(pi) && (pi == p.length() - 1 || p.charAt(pi + 1) != '*')) {
//                return false;
//            }
//
//            if (pi < p.length() - 1 && p.charAt(pi + 1) == '*') {
//                //Handle .*
//                if (p.charAt(pi) == '.'){
//                    if (pi == p.length() - 2){
//                        return true;
//                    }
//                    pi = pi + 2;
//                    boolean match = false;
//                    while (si < s.length()) {
//                        match = isMatch(s.substring(si), p.substring(pi));
//                        if (match) {
//                            return true;
//                        }
//                        si++;
//                    }
//                    return isMatch("", p.substring(pi));
//                }
//                if (p.charAt(pi) != s.charAt(si)) {
//                    if (pi == p.length() - 2) {
//                        return false;
//                    }
//                    return isMatch(s.substring(si), p.substring(pi + 2));
//                }
//                //s[si] == p[pi+2], try to match s[si] with p[pi + 2] first
//                if (pi < p.length() - 2) {
//                    //Try to match until last character equal to p[pi+2]
//                    pi = pi + 2;
//                    char s0 = s.charAt(si);
//                    boolean match;
//                    boolean lastTry = false;
//                    while (si < s.length() && !lastTry) {
//                        if (s.charAt(si) != s0){
//                            lastTry = true;
//                        }
//                        match = isMatch(s.substring(si), p.substring(pi));
//                        if (match) {
//                            return true;
//                        }
//                        si++;
//                    }
//                    if (si == s.length() && !lastTry){
//                        return isMatch("", p.substring(pi));
//                    }
//                    return false;
//                }
//                //bbbb - b*, check if any s[si] != p[i]
//                while (si < s.length()) {
//                    if (s.charAt(si) != p.charAt(pi)) {
//                        return false;
//                    }
//                    si++;
//                }
//                return true;
//            }
//            if (p.charAt(pi) == '.' || s.charAt(si) == p.charAt(pi)) {
//                si++;
//                pi++;
//            } else {
//                return false;
//            }
//        }
//        if (si == s.length() && pi < p.length()){
//            return isMatch("", p.substring(pi));
//        }
//        return si == s.length() && pi == p.length();
//    }


//    public static boolean isMatch(String s, String p){
//        int si = 0;
//        int pi = 0;
//
//        while (si < s.length() && pi < p.length()){
//            if (p.charAt(pi) != '.' && p.charAt(pi) != '*' && s.charAt(si) != p.charAt(pi)){
//                //Find next start point p
//                if (pi == p.length() - 1){
//                    return false;
//                } else {
//                    pi++;
//                    if (p.charAt(pi) == '*'){
//                        if (pi == p.length() - 1){
//                            return false;
//                        }
//                        return isMatch(s.substring(si), p.substring(pi+1));
//                    }
//                    return isMatch(s, p.substring(pi));
//                }
//            }
//            if (p.charAt(pi) == '.'){
//                if (pi+1 < p.length() && p.charAt(pi+1) == '*'){
//                    int si2 = si+1;
//                    while (si2 < s.length() && s.charAt(si) == s.charAt(si2)){
//                        if (s.charAt(si) == s.charAt(si2)){
//                            si2++;
//                        }
//                    }
//                    return isMatch(s.substring(si2), p.substring(pi+2));
//                }
//                si++;
//                pi++;
//            } else if (p.charAt(pi) == '*'){
//                while (si < s.length()){
//                    if (p.charAt(pi-1) == '.'){
//                        if (pi == p.length() - 1) {
//                            return true;
//                        }
//                        if (s.charAt(si) == p.charAt(pi+1)){
//                            return isMatch(s.substring(si), p.substring(pi+1));
//                        }
//                    } else if (s.charAt(si) != p.charAt(pi-1)){
//                        pi++;
//                        if (pi == p.length()){
//                            return false;
//                        }
//                        return isMatch(s.substring(si), p.substring(pi));
//                    }
//                    si++;
//                }
//                return p.charAt(pi - 1) != '.';
//            } else if (p.charAt(pi) == s.charAt(si)){
//                si++;
//                pi++;
//            }
//        }
//        if (si == s.length() && pi < p.length()){
//            while (pi < p.length()){
//                if (p.charAt(pi) == '*' && p.charAt()){
//                    pi++;
//                } else if (pi+1 < p.length() && p.charAt(pi+1) == '*'){
//                    pi = pi + 2;
//                } else {
//                    return false;
//                }
//            }
//            if (pi == p.length()){
//                return true;
//            }
//        }
//        return s.length() == p.length();
//    }
}
