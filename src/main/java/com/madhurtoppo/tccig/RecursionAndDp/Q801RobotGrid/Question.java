package com.madhurtoppo.tccig.RecursionAndDp.Q801RobotGrid;

public class Question {

    public int uniquePaths(int m, int n) {
        return uniquePaths(m - 1, n - 1, new int[n][m]);
    }

    private int uniquePaths(int m, int n, int[][] memo) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (m == 0 || n == 0) {
            return 1;
        }
        if (memo[n][m] != 0) {
            return memo[n][m];
        }
        memo[n][m] = uniquePaths(m - 1, n, memo) + uniquePaths(m, n - 1, memo);
        return memo[n][m];
    }
}