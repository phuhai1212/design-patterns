package com.example.designpatterns.algorithm;

public class AddTwoNumber {
    public static int addTwoNumber(int a, int b, String mode){
        switch (mode){
            case "ADD": return a + b;
            case "MINUS": return a - b;
            case  "MUL": return a * b;
        }
        return 0;
    }
}
