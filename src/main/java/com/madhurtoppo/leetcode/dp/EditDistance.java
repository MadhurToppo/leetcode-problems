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

        int[][] matched = new int[c1.length + 1][c2.length + 1];
        for (int i = 0; i <= c1.length; i++) {
            matched[i][0] = i;
        }
        for (int j = 0; j <= c2.length; j++) {
            matched[0][j] = j;
        }

        for (int i = 0; i < c1.length; i++) {
            for (int j = 0; j < c2.length; j++) {
                if (c1[i] == c2[j]) {
                    matched[i + 1][j + 1] = matched[i][j];
                } else {
                    matched[i + 1][j + 1] = Math.min(Math.min(matched[i][j + 1], matched[i + 1][j]), matched[i][j]) + 1;
                }
            }
        }

        return matched[c1.length][c2.length];
    }
}
