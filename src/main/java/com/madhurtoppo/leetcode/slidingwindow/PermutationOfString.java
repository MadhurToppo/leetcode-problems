package com.madhurtoppo.leetcode.slidingwindow;

public class PermutationOfString {
    public boolean checkInclustion(String s1, String s2) {
        int[] hash = new int[256];

        for (char c : s1.toCharArray()) {
            hash[c]++;
        }

        int left = 0;
        int right = 0;

        while (right < s2.length()) {
            char c = s2.charAt(right);
            hash[c]--;
            right++;
            while (hash[c] < 0) {
                hash[s2.charAt(left)]++;
                left++;
            }
            if (right - left == s1.length()) {
                return true;
            }
        }

        return false;
    }
}
