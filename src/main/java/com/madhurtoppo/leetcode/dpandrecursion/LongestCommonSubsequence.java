package com.madhurtoppo.leetcode.dpandrecursion;

public class LongestCommonSubsequence {
     public int recursive(String text1, String text2) {
         int i = text1.length() - 1;
         int j = text2.length() - 1;
         return lcs(text1, text2, i, j);
     }

     private int lcs(String s, String t, int i, int j) {
         if (i < 0 || j < 0) {
             return 0;
         }
         int result;
         if (s.charAt(i) == t.charAt(j)) {
             result = 1 + lcs(s, t, i-1, j-1);
         } else {
             result = Math.max(lcs(s, t, i-1, j), lcs(s, t, i, j-1));
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
