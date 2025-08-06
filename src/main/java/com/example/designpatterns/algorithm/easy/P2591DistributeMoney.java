package com.example.designpatterns.algorithm.easy;

public class P2591DistributeMoney {
    public static int distMoney(int money, int children) {
        if (children > money){
            return -1;
        }
        if (children == money){
            return 0;
        }
        //Distribute 1$ for each child
        int remain = money - children;

        //Determine maximum 8$ child
        int nums = remain/7;
        if (nums == 0){
            return 0;
        }
        remain = remain - nums * 7;
        if (nums == children){
            if (remain == 0){
                return children;
            }
            return children - 1;
        }
        if (nums > children){
            return children - 1;
        }

        if (remain == 3){
            if (children - nums > 1){
                return nums;
            }
            return nums - 1;
        }
        return nums;
    }
}
