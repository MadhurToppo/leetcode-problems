package com.madhurtoppo.tccig.RecursionAndDp.Q803Josephus;

public class Question {
    public int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            // Subtract 1 from inside and add 1 outside as it is one-indexed
            return (k + 1 + josephus(n - 1, k) - 2) % n + 1;
        }
    }
}
