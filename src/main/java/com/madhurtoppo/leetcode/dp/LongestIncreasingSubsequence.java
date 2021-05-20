package com.madhurtoppo.leetcode.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] memo = new int[nums.length];
        int length = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(memo, 0, length, num);
            if (i < 0) {
                i = -(i + 1);
            }
            memo[i] = num;
            if (i == length) {
                length++;
            }
        }
        return length;
    }
}
