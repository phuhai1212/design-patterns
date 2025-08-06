package com.example.designpatterns.algorithm.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P2591DistributeMoneyTest {

    @Test
    void distMoney() {
        Assertions.assertEquals(1, P2591DistributeMoney.distMoney(20, 3));
    }

    @Test
    void distMoney2() {
        Assertions.assertEquals(2, P2591DistributeMoney.distMoney(16, 2));
    }
    @Test
    void distMoney3() {
        Assertions.assertEquals(1, P2591DistributeMoney.distMoney(17, 2));
    }
}