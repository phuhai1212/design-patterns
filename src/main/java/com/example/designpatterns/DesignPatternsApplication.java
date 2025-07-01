package com.example.designpatterns;

import com.example.designpatterns.algorithm.ListNode;
import com.example.designpatterns.behavioral.observer.base.VideoData;
import com.example.designpatterns.behavioral.observer.notifiers.EmailNotifier;
import com.example.designpatterns.behavioral.observer.notifiers.PhoneNotifier;
import com.example.designpatterns.behavioral.observer.notifiers.YoutubeNotifier;
import com.example.designpatterns.behavioral.strategy.Discount1;
import com.example.designpatterns.behavioral.strategy.Discount2;
import com.example.designpatterns.behavioral.strategy.Ticket;
import com.example.designpatterns.creational.builder.implement1.Address;
import com.example.designpatterns.creational.builder.implement1.UserWebDTOBuilder;
import com.example.designpatterns.creational.builder.implement2.UserDTO;
import com.example.designpatterns.creational.factorymethod.JSONMessageCreator;
import com.example.designpatterns.creational.factorymethod.Message;
import com.example.designpatterns.creational.factorymethod.MessageCreator;
import com.example.designpatterns.creational.factorymethod.TextMessageCreator;
import com.example.designpatterns.creational.singleton.LazySingletonObject;
import com.example.designpatterns.creational.singleton.SingletonObject;
import com.example.designpatterns.structural.decorator.base.IMilkTea;
import com.example.designpatterns.structural.decorator.base.MilkTea;
import com.example.designpatterns.structural.decorator.decorators.BlackSugar;
import com.example.designpatterns.structural.decorator.decorators.Bubble;
import com.example.designpatterns.structural.decorator.decorators.EggPudding;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootApplication
@Slf4j
public class DesignPatternsApplication {
    public static void main(String[] args) {

        SpringApplication.run(DesignPatternsApplication.class, args);
//        testFactoryMethod();
//        testBuilder();
//        testStrategy();
//        testObserver();
//        testSingleton();
//        testDecorator();

//        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
//        int[] height2 = new int[]{4,2,0,3,2,5};
//        int q3Result = q3TrapingRainWater(height);
//        log.info(">> Trapping rain water result: {}", q3Result);

//        String[] strs = new String[]{"cbbdabc"};
//        String[] strs1 = new String[]{"deehdecfcgegffegghfhfaagcaaffbfahcfaghgdfggbbddbff","dchhgcbahdbdgbbaafhbgfggcbebfacdebhfgcfaafcgbgbggg","hehdggagfabdfbhegebhaaddcaghhegeegdgegagehhdhheecd","fhbbagbdffedafacbeahddbgagggdafceeabaffhhhhcedcfbh","caaefgdgefeahcgfgccaacdfabdgdbdhdbhbhfadbeaegbbdce","habgbahaeebeacccbdhfhddegfebheeffdbcbgfahhgbhcheeb","gfaaedgcachcehgdghebbhegbfagdgcdcgebddbdccbedbbhcd","badaebdbdgeadbfgchaegaddgdhdgaeaaedagacgbdecfdghca","eefcceffcggeefbecaceadbdcfccgbfgffgahfgeebafdcfhhb","aeebdahabfecbafgbcchbhdeecaadaccbahghcbdcfaeagehha"};
//        int p960Result = p960DeleteColumnsToMakeSortedIII(strs);
//        log.info(">> P960 result: {}", p960Result);
//
//        String[] strs = new String[]{"abcd",
//                                     "efdh",
//                                     "ikem",
//                                     "nafb"};
//        log.info(">> Result: {}", minDeletionSize(strs));

//        char[][] board = {{'5','3','.','.','7','.','.','.','.'}, //4208
//                          {'6','.','.','1','9','5','.','.','.'},
//                          {'.','9','8','.','.','.','.','6','.'},
//                          {'8','.','.','.','6','.','.','.','3'},
//                          {'4','.','.','8','.','3','.','.','1'},
//                          {'7','.','.','.','2','.','.','.','6'},
//                          {'.','6','.','.','.','.','2','8','.'},
//                          {'.','.','.','4','1','9','.','.','5'},
//                          {'.','.','.','.','8','.','.','7','9'}};
//
//        char[][] board2 =  {{'.','.','.','2','.','.','.','6','3'}, //2732
//                            {'3','.','.','.','.','5','4','.','1'},
//                            {'.','.','1','.','.','3','9','8','.'},
//                            {'.','.','.','.','.','.','.','9','.'},
//                            {'.','.','.','5','3','8','.','.','.'},
//                            {'.','3','.','.','.','.','.','.','.'},
//                            {'.','2','6','3','.','.','5','.','.'},
//                            {'5','.','3','7','.','.','.','.','8'},
//                            {'4','7','.','.','.','1','.','.','.'}};
//
//        char[][] board3 =  {{'.','.','9','7','4','8','.','.','.'}, //13528
//                            {'7','.','.','.','.','.','.','.','.'},
//                            {'.','2','.','1','.','9','.','.','.'},
//                            {'.','.','7','.','.','.','2','4','.'},
//                            {'.','6','4','.','1','.','5','9','.'},
//                            {'.','9','8','.','.','.','3','.','.'},
//                            {'.','.','.','8','.','3','.','2','.'},
//                            {'.','.','.','.','.','.','.','.','6'},
//                            {'.','.','.','2','7','5','9','.','.'}};
//        solveSudokuV2(board);
//        String s = "dab##";
//        String t = "a#dc#k#";
//        if (backspaceCompare(s, t)){
//            log.info(">> TRUE");
//        } else {
//            log.info(">> FALSE");
//        }

        //ebcbb_e_cecabbacec_bbcbe

//        String s = "ebcbbececabbacecbbcbe";
//        log.info("Check almost palindrome of '{}': {}", s, isAlmostPalindrome(s));

//        String a = "abc";
//        String b = a;
//        a = "a";
//        log.info("a: {}, b: {}", a, b);

    }

    public static void testBuilder(){
        //Input data
        String firstName = "Hai";
        String lastName = "Van";
        Address address = new Address("92", "Nguyen Huu Canh", "HCM City");
        LocalDate birthday = LocalDate.of(1995, 12, 12);

        //Create builder
//        UserWebDTOBuilder builder = new UserWebDTOBuilder();
//        UserDTO userDTO = builder.withFirstName(firstName).withLastName(lastName).withBirthday(birthday).withAddress(address)
//                .build();
//        log.info("User DTO: {}", userDTO);

        UserDTO.UserWebDTOBuilder builder = new UserDTO.UserWebDTOBuilder();
        UserDTO userDTO = builder.withFirstName(firstName).withLastName(lastName).withBirthday(birthday).withAddress(address)
                .build();
        log.info("User DTO: {} - {} - {}", userDTO.getName(), userDTO.getAge(), userDTO.getAddress());
    }

    public static void testFactoryMethod(){
        printMessageFactoryMethod(new TextMessageCreator());
        printMessageFactoryMethod(new JSONMessageCreator());
    }

    private static void printMessageFactoryMethod(MessageCreator creator){
        Message msg = creator.createMessage();
        log.info(">> Message: {}", msg.getContent());
    }

    public static void testStrategy(){
        Ticket ticket1 = new Ticket(100000, "Standard", new Discount1());
        Ticket ticket2 = new Ticket(500000, "VIP", new Discount2());
        log.info(">> {} Ticket: Normal price {}, Promoted price {}", ticket1.getName(), ticket1.getPrice(), ticket1.getPromotedPrice());
        log.info(">> {} Ticket: Normal price {}, Promoted price {}", ticket2.getName(), ticket2.getPrice(), ticket2.getPromotedPrice());
    }

    public static void testObserver(){
        VideoData videoData = new VideoData();

        new EmailNotifier(videoData);
        new PhoneNotifier(videoData);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoData);
        videoData.setTitle("Observer design pattern");

        log.info("---------------------------------------------------------");
        videoData.detachObserver(youtubeNotifier);
        videoData.setDescription("OK");

    }

    public static void testSingleton(){
        //Eager initialization
        SingletonObject.getInstance().sayHi();

        //Lazy initialization
        LazySingletonObject.getInstance().sayHi();
        LazySingletonObject.getInstance().sayHi();

        //Lazy initialization with Multithreading
        Thread thread1 = new Thread(() -> LazySingletonObject.getInstance().sayHi());
        Thread thread2 = new Thread(() -> LazySingletonObject.getInstance().sayHi());
        thread1.start();
        thread2.start();
    }

    public static void testDecorator(){
        IMilkTea milkTea1 = new EggPudding(new BlackSugar(new Bubble(new MilkTea())));
        log.info("Price of EggPuddingBlackSugarBubbleMilkTea: {}", milkTea1.cost());

        IMilkTea milkTea2 = new EggPudding(new EggPudding(new Bubble(new MilkTea())));
        log.info("Price of EggPuddingX2BubbleMilkTea: {}", milkTea2.cost());
    }

    /* 42. TRAPPING RAIN WATER
    Given n non-negative integers representing an elevation map where the width of each bar is 1,
    compute how much water it can trap after raining.
     */
    public static int q3TrapingRainWater(int[] height){
        int result = 0;
        int maxHeight = 0;
        int pmax = 0;

        //find the max number
        for (int i  = 0; i < height.length; i++){
            if (height[i] > maxHeight){
                maxHeight = height[i];
                pmax = i;
            }
        }

        int p1 = 0;
        while (p1 < pmax){
            if (height[p1] == 0){
                p1++;
            } else {
                int p2 = p1 + 1;
                while (p2 <= pmax && height[p2] < height[p1]){
                    result += height[p1] - height[p2];
                    p2++;
                }
                p1 = p2;
            }
        }
        p1 = height.length - 1;
        while (p1 > pmax){
            if (height[p1] == 0){
                p1--;
            } else {
                int p2 = p1 - 1;
                while (p2 >= pmax && height[p2] < height[p1]){
                    result += height[p1] - height[p2];
                    p2--;
                }
                p1 = p2;
            }
        }

        return result;
    }


    /* 960. DELETE COLUMN TO MAKE SORTED
    You are given an array of n strings strs, all of the same length.
    We may choose any deletion indices, and we delete all the characters in those indices for each string.
    For example, if we have strs = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef", "vyz"].
    Suppose we chose a set of deletion indices answer such that after deletions, the final array has every string (row) in lexicographic order.
    (i.e., (strs[0][0] <= strs[0][1] <= ... <= strs[0][strs[0].length - 1]), and (strs[1][0] <= strs[1][1] <= ... <= strs[1][strs[1].length - 1]), and so on).
    Return the minimum possible value of answer.length.
     */
    public static int p960DeleteColumnsToMakeSortedIII(String[] strs){
        int length = strs[0].length();
        int[] dp = new int[length];

        int max = 0;
        for (int i = 0; i < length; i++){
            dp[i] = 1;
            for (int j = 0; j < i; j++){
                if (checkLarger(j,i, strs)){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            log.info(Arrays.toString(dp));
            max = Math.max(max, dp[i]);
        }
        return length - max;
    }
    public static boolean checkLarger(int j, int i, String[] strs){
        for (String s : strs){
            if (s.charAt(j) > s.charAt(i)){
                return false;
            }
        }
        return true;
    }

    /*
    You are given an array of n strings strs, all of the same length.
    The strings can be arranged such that there is one on each line, making a grid.

    For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
        abc
        bce
        cae
    You want to delete the columns that are not sorted lexicographically.
    In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted,
    while column 1 ('b', 'c', 'a') is not, so you would delete column 1.

    Return the number of columns that you will delete.
     */
    public static int minDeletionSize(String[] strs) {
        int m = strs[0].length();
        int n = strs.length;
        int numDelCol = 0;
        for (int i = 0; i < m; i++){
            int p1 = 0;
            boolean isDel = false;
            while (p1 < n - 1 && !isDel){
                if (strs[p1].charAt(i) > strs[p1 + 1].charAt(i)){
                    numDelCol++;
                    isDel = true;
                }
                p1++;
            }
        }
        return numDelCol;
    }

    /* 37. SUDOKU SOLVER
    Write a program to solve a Sudoku puzzle by filling the empty cells.
    A sudoku solution must satisfy all of the following rules:
    - Each of the digits 1-9 must occur exactly once in each row.
    - Each of the digits 1-9 must occur exactly once in each column.
    - Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
    The '.' character indicates empty cells.
     */

    public static char[][] sudokuSolver(char[][] board){
        int unfilledNum = 81;
        Map<String, Set<Character>> init = solve(board, true);

        Stack<Map<String, Character>> stack = new Stack<>();
        Stack<char[][]> stackBoard = new Stack<>();
        unfilledNum = pushStack(stack, init, stackBoard, board);
        for (int r = 0; r < 9; r++){
            log.info(Arrays.toString(board[r]));
        }
        log.info(">> Remain numbers: {}", unfilledNum);

        while (!stack.empty() && !stackBoard.empty()){
//            log.info(">> Board before pop: ");
//            for (int r = 0; r < 9; r++){
//                log.info(Arrays.toString(board[r]));
//            }
            board = stackBoard.pop();
//            log.info(">> Board after pop: ");
//            for (int r = 0; r < 9; r++){
//                log.info(Arrays.toString(board[r]));
//            }
            Map<String, Character> map = stack.pop();
            Map.Entry<String, Character> entry = map.entrySet().iterator().next();
            int rIndex = Character.getNumericValue(entry.getKey().charAt(0));
            int cIndex = Character.getNumericValue(entry.getKey().charAt(2));
            board[rIndex][cIndex] = entry.getValue();
            unfilledNum--;
            log.info("> Try to fill {} to [{},{}]", board[rIndex][cIndex], rIndex, cIndex);
            Map<String, Set<Character>> nextKey = solve(board, false);
            if (nextKey != null){
                unfilledNum = pushStack(stack, nextKey, stackBoard, board);
            }
            for (int r = 0; r < 9; r++){
                log.info(Arrays.toString(board[r]));
            }
            log.info(">> Remain numbers: {}", unfilledNum);

        }

        return null;
    }

    public static int pushStack(Stack<Map<String, Character>> stack, Map<String, Set<Character>> map, Stack<char[][]> stackBoard, char[][] board){

        Map.Entry<String, Set<Character>> entry = map.entrySet().iterator().next();
        log.info("Push stack for {}: {}", entry.getKey(), Arrays.toString(entry.getValue().toArray()));

        AtomicInteger result = new AtomicInteger(-1);

        map.forEach((k, set) -> {
            set.forEach(v -> {
                Map<String, Character> m = new HashMap<>();
                m.put(k.substring(0,3), v);
                result.set(Integer.parseInt(k.substring(4)));
                stack.push(m);
                char[][] boardCopy = new char[9][9];
                for (int r = 0; r < 9; r++){
                    for (int c = 0; c < 9; c++){
                        boardCopy[r][c] = board[r][c];
                    }
                }
                stackBoard.push(boardCopy);
            });
        });
        return result.intValue();
    }

    public static Map<String, Set<Character>> solve(char[][] board, boolean isFirst){
        int unfilledNum = 0;
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                //Check all possible number at [c][r] then put to list
                if (board[r][c] == '.') {
                    unfilledNum++;
                }
            }
        }
        boolean isNotChange = false;
        String nextKey = "";
        int nextStringNum = 10;
        boolean isFirstLoop = true;
        Map<String, Set<Character>> result = new HashMap<>();
        Map<String, Set<Character>> unfilledList = new HashMap<>();
        while (unfilledNum > 0 && !isNotChange){
            int temp = unfilledNum;
            for (int r = 0; r < 9; r++){
                for (int c = 0; c < 9; c++){
                    //Check all possible number at [c][r] then put to list
                    if (board[r][c] == '.') {
                        Set<Character> possibleNum = checkNum(board, c, r, "A");
                        if (possibleNum.isEmpty()){
                            return null;
                        }
                        if (possibleNum.size() == 1){
                            board[r][c] = (char) possibleNum.toArray()[0];
                            unfilledNum--;
                            log.info("Fill {} to [{},{}]", board[r][c], r, c);
                            String key = String.format("%s_%s", r, c);
                            unfilledList.remove(key);
                            if (key.equals(nextKey) && !unfilledList.isEmpty()){
                                nextKey = "";
                                nextStringNum = 10;
                                for (String k : unfilledList.keySet()){
                                    if (unfilledList.get(k).size() < nextStringNum){
                                        nextKey = k;
                                        nextStringNum = unfilledList.get(k).size();
                                    }
                                }
                                log.info("New key: {} size {}", nextKey, nextStringNum);
                            }
                        } else {
                            String key = String.format("%s_%s", r, c);
                            unfilledList.put(key, possibleNum);
                            if (possibleNum.size() < nextStringNum){
                                log.info("Next key: {} size {} -> {} size {}", nextKey, nextStringNum, key, possibleNum.size());
                                nextKey = key;
                                nextStringNum = possibleNum.size();
                            }

                        }
                    }

                }
            }
            if (temp == unfilledNum) {
                isNotChange = true;
            }
            isFirstLoop = false;
        }
        if (unfilledNum == 0){
            log.info(">> SOLVED");
            result.put("0_0_00", new HashSet<>());
            return result;
        }
        if (unfilledList.get(nextKey) == null) {
            log.info(">> Cannot get nextKey {}", nextKey);
            return null;
        }
        result.put(String.format("%s_%2s", nextKey, unfilledNum).replace(' ', '0'), unfilledList.get(nextKey));
        return result;
    }
    public static Set<Character> checkNum(char[][] board, int c, int r, String type){
        Set<Character> characters = new HashSet<>();
        //Try to use hash set
        for (char i = '1'; i <= '9'; i++){
            boolean rOK = false;
            boolean cOK = false;
            boolean bOK = false;
            if (type.equals("R") || type.equals("A")){
                byte cIndex = 0;
                boolean isFound = false;
                while (cIndex < 9 && !isFound){
                    if (board[r][cIndex] == i){
                        isFound = true;
                    } else {
                        cIndex++;
                    }
                }
                if (!isFound) {
                    characters.add(i);
                    rOK = true;
                }
            }
            if (type.equals("C") || type.equals("A")){
                byte rIndex = 0;
                boolean isFound = false;
                while (rIndex < 9 && !isFound){
                    if (board[rIndex][c] == i){
                        isFound = true;
                    } else {
                        rIndex++;
                    }
                }
                if (!isFound) {
                    characters.add(i);
                    cOK = true;
                }

            }
            if (type.equals("B") || type.equals("A")){
                int cL = (c/3) * 3;
                int rA = (r/3) * 3;

                int rIndex = rA;
                boolean isFound = false;
                while (rIndex < rA + 3 && !isFound){
                    int cIndex = cL;
                    while (cIndex < cL + 3 && !isFound){
                        if (board[rIndex][cIndex] == i){
                            isFound = true;
                        } else {
                            cIndex++;
                        }
                    }
                    rIndex++;
                }
                if (!isFound) {
                    characters.add(i);
                    bOK = true;
                }
            }
            if (type.equals("A") && !(rOK && cOK && bOK)){
                characters.remove(i);
            }
        }

        return characters;
    }

    static int check;
    static int numTry;

    public static boolean isValid(char arr[][],int row, int col, char ch){

        // row
        for(int j=0; j<9; j++){
            if(arr[row][j]==ch) return false;
        }

        // column

        for(int i=0; i<9; i++){
            if(arr[i][col]==ch) return false;
        }

        // Small Matrix

        int stR = (row/3)*3;
        int stC = (col/3)*3;

        for(int i=stR; i<stR+3; i++){
            for(int j=stC; j<stC+3; j++){
                if(arr[i][j]==ch) return false;
            }
        }
        return true;
    }

    public static void helper(char arr[][], int row, int col){

        if(row==9){
            check = 1;
            return;
        }

        if(arr[row][col]=='.'){
            for(char ch = '1'; ch<='9'; ch++){
                if(isValid(arr,row,col,ch)){
                    arr[row][col] = ch;
                    numTry++;
                    log.info(">> Try {}. Fill {} to [{},{}]", numTry, ch, row, col);
                    for (int r = 0; r < 9; r++){
                        log.info(Arrays.toString(arr[r]));
                    }
                    if(col==8){
                        helper(arr,row+1,0);
                    }else{
                        helper(arr,row,col+1);
                    }
                    if(check==1) return;
                    arr[row][col] = '.';
                }
            }
        }else{
            if(col==8) helper(arr,row+1,0);
            else helper(arr,row,col+1);
        }
    }
    public static void solveSudokuV2(char[][] arr) {
        numTry = 0;
        check = -1;
        helper(arr,0,0);
    }

    public static boolean backspaceCompare(String s, String t) {
        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;
        while (sIndex >= 0 || tIndex >= 0){
            int sMove = 0;
            while (sIndex >= 0 && (s.charAt(sIndex) == '#' || sMove > 0)){
                if (s.charAt(sIndex) == '#') sMove++;
                else sMove--;
                sIndex--;
            }

            int tMove = 0;
            while (tIndex >= 0 && (t.charAt(tIndex) == '#' || tMove > 0)){
                if (t.charAt(tIndex) == '#') tMove++;
                else tMove--;
                tIndex--;
            }

            if (sIndex < 0 && tIndex < 0){
                return true;
            }
            if (sIndex >= 0 && tIndex >= 0 && s.charAt(sIndex) == t.charAt(tIndex)){
                tIndex--;
                sIndex--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int longestString(String s){
         Map<Character, Integer> index = new HashMap<>();
         int result = 0;
         int tmpLength = 0;
         for (int i = 0; i < s.length(); i++){
             Integer lastIndex = index.get(s.charAt(i));
             if (lastIndex == null || (tmpLength < i - lastIndex)){
                 tmpLength++;
                 if (tmpLength > result) {
                     result = tmpLength;
                 }
             } else {
                 tmpLength = i - lastIndex;
             }
             index.put(s.charAt(i), i);
         }

         return result;
    }

    public static int longestStringUsingSlidingWindow(String s){
        int p1 = 0;
        int p2 = 0;
        int maxLength = 0;
        Map<Character, Integer> index = new HashMap<>();
        while (p2 < s.length()){
            if (index.get(s.charAt(p2)) == null || index.get(s.charAt(p2)) < p1){
                maxLength = Math.max(maxLength, p2 - p1 + 1);
            } else {
                p1 = index.get(s.charAt(p2)) + 1;
            }
            index.put(s.charAt(p2), p2);
            p2++;
        }
        return maxLength;
    }

    //abckdebedgcba
    public static boolean isAlmostPalindrome(String s){
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int p1 = 0;
        int p2 = s.length() - 1;
        while (p2 > p1){
            if (s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;
            } else {
                return checkPalindrome(s, p1 + 1, p2) || checkPalindrome(s, p1, p2 - 1);
            }
        }
        return p1 >= p2;
    }

    public static boolean checkPalindrome(String s, int p1, int p2){
        while (p2 > p1){
            if (s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;
                continue;
            }
            break;
        }
        return p1 >= p2;
    }

    /*
        [3, 2, 4]
        [8, 5, 2]
        ---------
        [1, 8, 6]

        HEAD -> null
        HEAD: 1 -> TAIL: 1 -> NULL


     */
    public static ListNode addTwoNumber(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode tail = head;
        int carry = 0;
        while ((l1 != null) || (l2 != null) || (carry != 0)){
            int l1Val = (l1 == null)? 0 : l1.val;
            int l2Val = (l2 == null)? 0 : l2.val;
            int sum = (l1Val + l2Val + carry) % 10;
            carry = (l1Val + l2Val + carry)/10;
            ListNode newNode = new ListNode(sum);
            tail.next = newNode;
            tail = tail.next;
            l1 = (l1 == null)? null : l1.next;
            l2 = (l2 == null)? null : l2.next;

        }
        return head;
    }

    public ListNode removeNthNodeFromTheEnd(ListNode head, int n){
        ListNode newTail = head;
        while (head.next != null){
            head = head.next;
            ListNode newNode = new ListNode(head.val);
            newNode.next = newTail;
            newTail = newNode;
        }
        int i = 1;
        while (i < n){
            newTail = newTail.next;
            i++;
        }
        return newTail;
    }

    public static int calculateTwoNumber(int a, int b, String function){
        return switch (function) {
            case "ADD" -> a + b;
            case "MINUS" -> a - b;
            case "MUL" -> a * b;
            case "DIV" -> a / b;
            default -> 0;
        };

    }

}
