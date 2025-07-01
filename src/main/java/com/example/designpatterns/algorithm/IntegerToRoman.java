package com.example.designpatterns.algorithm;

public class IntegerToRoman {
    private static final String[][] ROMAN_SYMBOL = {{"I", "V", "X"},
                                                    {"X", "L", "C"},
                                                    {"C", "D", "M"},
                                                    {"M", "", ""}};
    public static String convertIntegerToRoman(int n){
        StringBuilder result = new StringBuilder();
        int exp = 0;
        while (n > 0){
            result.insert(0,convertDigit(n % 10, ROMAN_SYMBOL[exp]));
            n /= 10;
            if (exp < 3) exp++;
        }
        return result.toString();
    }

    private static String convertDigit(int n, String[] roman){
        StringBuilder result = new StringBuilder();
        return switch (n) {
            case 1 -> result.append(roman[0]).toString();
            case 2 -> result.append(roman[0]).append(roman[0]).toString();
            case 3 -> result.append(roman[0]).append(roman[0]).append(roman[0]).toString();
            case 4 -> result.append(roman[0]).append(roman[1]).toString();
            case 5 -> result.append(roman[1]).toString();
            case 6 -> result.append(roman[1]).append(roman[0]).toString();
            case 7 -> result.append(roman[1]).append(roman[0]).append(roman[0]).toString();
            case 8 -> result.append(roman[1]).append(roman[0]).append(roman[0]).append(roman[0]).toString();
            case 9 -> result.append(roman[0]).append(roman[2]).toString();
            default -> "";
        };
    }
}
