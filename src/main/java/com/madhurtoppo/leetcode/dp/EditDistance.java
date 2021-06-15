package com.madhurtoppo.leetcode.dp;

public class EditDistance {
    public int recursive(String word1, String word2) {
        if (word1 == null || word1.length() == 0) {
            return word2.length();
        }
        if (word2 == null || word2.length() == 0) {
            return word1.length();
        }
        return match(word1, word2, 0, 0);
    }

    private int match(String s1, String s2, int i, int j) {
        if (s1.length() == i) {
            return s2.length() - j;
        }
        if (s2.length() == j) {
            return s1.length() - i;
        }

        int result;
        if (s1.charAt(i) == s2.charAt(j)) {
            result = match(s1, s2, i + 1, j + 1);
        } else {
            int insert = match(s1, s2, i, j + 1);
            int delete = match(s1, s2, i + 1, j);
            int replace = match(s1, s2, i + 1, j + 1);
            result = 1 + Math.min(Math.min(insert, delete), replace);
        }

        return result;
    }

    public int iterative(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return -1;
        }
        if (word1.length() == 0) {
            return word2.length();
        }
        if (word2.length() == 0) {
            return word1.length();
        }

        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();

        int n = c1.length;
        int m = c2.length;
        int[][] memo = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            memo[i][0] = i;
        }
        for (int j = 0; j <= m; j++) {
            memo[0][j] = j;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (c1[i] == c2[j]) {
                    memo[i + 1][j + 1] = memo[i][j];
                } else {
                    int insert = memo[i][j + 1];
                    int delete = memo[i + 1][j];
                    int replace = memo[i][j];
                    memo[i + 1][j + 1] = Math.min(Math.min(insert, delete), replace) + 1;
                }
            }
        }

        return memo[n][m];
    }
}
