package com.madhurtoppo.dpandrecursion.leetcode.q322coin_change;

import com.madhurtoppo.dpandrecursion.leetcode.q322coin_change.CoinChange;
//import com.madhurtoppo.leetcode.dpandrecursion.CoinChange;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    private CoinChange coinChange;
    private int[] coins;
    private int amount;
    private int actual;
    private int expected;

    @BeforeEach
    void setUp() {
        coinChange = new CoinChange();
    }

    @Test
    void coinChangeTest1() {
        coins = new int[]{1,2,5};
        amount = 11;
        actual = coinChange.memoize(coins, amount);
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void coinChangeTest2() {
        coins = new int[]{2};
        amount = 3;
        actual = coinChange.memoize(coins, amount);
        expected = -1;
        assertEquals(expected, actual);
    }
}