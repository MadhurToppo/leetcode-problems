package com.madhurtoppo.dpandrecursion.tccig.q803josephus;

public class Question {
    public int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            // (k + 1 + josephus(n - 1, k) - 1) {Move to k + 1 position and subtract 1 after killing 1 person}
            // (k + 1 + josephus(n - 1, k) - 1) % n {To wrap into circle}
            // (k + 1 + josephus(n - 1, k) - 2) % n + 1 {-1 from inside and +1 from outside as it is one-indexed}
            return (k + 1 + josephus(n - 1, k) - 2) % n + 1;
        }
    }
}
