package com.example.designpatterns.algorithm.medium;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InterestingTimePatterns {
    //HH:MM:SS
    //HH = substring(0,2)
    //MM = substring(3,5)
    //SS = substring(6)
    public static int solution(String S, String T){
        return countInterestingTimes(S, T);
//        int temp = parseTime2Number(S);
//        int end = parseTime2Number(T);
//        int count = 0;
//        while (temp <= end){
//            if (isValid(temp)){
//                count++;
//            }
//            temp++;
//        }
//        return count;
    }

    private static int parseTime2Number(String time){
        return Integer.parseInt(time.substring(0,2)) * 10000 + Integer.parseInt(time.substring(3,5)) * 100 + Integer.parseInt(time.substring(6));
    }

    private static boolean isValid(int time){
        //Check if is valid time
        if (time/10000 > 23){
            return false;
        }
        if ((time%10000)/100 > 59) {
            return false;
        }
        if (time%100 > 59){
            return false;
        }

        //Check if interest
        return isInterestingNumberV2(time);
    }

    private static boolean isInterestingNumber(String time){
        Set<Character> characters = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < time.length(); i++){
            characters.add(time.charAt(i));
            if (characters.size() > 2){
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean isInterestingNumber(int time) {
        int mask = 0;
        while (time > 0) {
            int digit = time % 10;
            mask |= (1 << digit);
            if (Integer.bitCount(mask) > 2) return false;
            time /= 10;
        }
        return true;
    }

    private static boolean isInterestingNumberV2(int time) {
        String timeStr = String.format("%06d", time); // Pad with leading zeros
        int mask = 0;
        for (char c : timeStr.toCharArray()) {
            mask |= 1 << (c - '0');
            if (Integer.bitCount(mask) > 2) return false;
        }
        return true;
    }

    public static int countInterestingTimes(String startTime, String endTime) {
        int start = toSeconds(startTime);
        int end = toSeconds(endTime);
        Set<Integer> uniqueTimes = new HashSet<>();

        // Generate all digit sets of size 1 and 2
        for (int i = 0; i <= 9; i++) {
            generateTimes(Set.of(i), start, end, uniqueTimes);
            for (int j = i + 1; j <= 9; j++) {
                generateTimes(Set.of(i, j), start, end, uniqueTimes);
            }
        }

        return uniqueTimes.size();
    }

    private static void generateTimes(Set<Integer> digits, int start, int end, Set<Integer> resultSet) {
        int[] d = digits.stream().mapToInt(Integer::intValue).toArray();

        for (int h1 : d) for (int h2 : d) {
            int hour = h1 * 10 + h2;
            if (hour > 23) continue;
            for (int m1 : d) for (int m2 : d) {
                int minute = m1 * 10 + m2;
                if (minute > 59) continue;
                for (int s1 : d) for (int s2 : d) {
                    int second = s1 * 10 + s2;
                    if (second > 59) continue;

                    int timeInSec = hour * 3600 + minute * 60 + second;
                    if (timeInSec >= start && timeInSec <= end) {
                        resultSet.add(timeInSec);
                    }
                }
            }
        }
    }

    private static int toSeconds(String time) {
        int h = Integer.parseInt(time.substring(0, 2));
        int m = Integer.parseInt(time.substring(3, 5));
        int s = Integer.parseInt(time.substring(6, 8));
        return h * 3600 + m * 60 + s;
    }


    private static boolean isLessOrEqualThan(String t1, String t2){
        return Integer.parseInt(t1.replaceAll(":","")) <= Integer.parseInt(t2.replaceAll(":",""));
    }



    private static String getNextSecond(String current){
        int second = Integer.parseInt(current.substring(6));
        if (second < 59){
            return current.substring(0,6) + String.format("%02d", second + 1);
        }
        return getNextMin(current);
    }

    private static String getNextMin(String current){
        int min = Integer.parseInt(current.substring(3,5));
        if (min < 59){
            return current.substring(0,3) + String.format("%02d", min + 1) + ":00";
        }
        return getNextHour(current);
    }

    private static String getNextHour(String current){
        int hour = Integer.parseInt(current.substring(0,2));
        if (hour < 23){
            return String.format("%02d", hour + 1) + ":00:00";
        }
        return "00:00:00";
    }

    private static boolean isInteresting(String time){
        Set<Character> characters = new HashSet<>();
        boolean result = true;
        for (int i = 0; i < time.length(); i++){
            characters.add(time.charAt(i));
            if (characters.size() > 3){
                result = false;
                break;
            }
        }
        return result;
    }

    public static int findInterestingTimes(String startTime, String endTime) {
        int count = 0;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime start = LocalTime.parse(startTime, formatter);
        LocalTime end = LocalTime.parse(endTime, formatter);

        while (!start.isAfter(end)) {
            String timeStr = start.format(formatter);
            if (isInterestingTime(timeStr)) {
                count++;
            }
            start = start.plusSeconds(1);
        }

        return count;
    }

    private static boolean isInterestingTime(String time) {
        Set<Character> digits = new HashSet<>();
        for (char ch : time.toCharArray()) {
            if (ch != ':') {
                digits.add(ch);
            }
        }
        return digits.size() <= 2;
    }


}
