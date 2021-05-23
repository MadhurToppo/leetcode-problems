package com.madhurtoppo.leetcode.slidingwindow;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;

        while (start < nums.length) {
            if (sum < target && end < nums.length) {
                sum += nums[end];
                end++;
            } else if (sum >= target) {
                minLength = Math.min(minLength, end - start);
                sum -= nums[start];
                start++;
            } else {
                break;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
