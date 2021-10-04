package com.madhurtoppo.dpandrecursion.leetcode.q1143longest_common_subsequence;

public class LongestCommonSubsequence {
    public int recursive(String s, String t) {
        return lcs(s, s.length() - 1, t, t.length() - 1);
    }

    private int lcs(String s, int sLength, String t, int tLength) {
        if (sLength < 0 || tLength < 0) {
            return 0;
        }
        int result;
        if (s.charAt(sLength) == t.charAt(tLength)) {
            result = 1 + lcs(s, sLength - 1, t, tLength - 1);
        } else {
            result = Math.max(lcs(s, sLength - 1, t, tLength), lcs(s, sLength, t, tLength - 1));
        }
        return result;
    }

    public int iterative(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] memo = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    memo[i][j] = 1 + memo[i - 1][j - 1];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }
        return memo[n][m];
    }
}