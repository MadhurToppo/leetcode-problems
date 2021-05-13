package com.madhurtoppo.leetcode.dp;

public class MaxProduct {
    public int kadane(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int prevMax = currMax;
            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(prevMax * nums[i], currMin * nums[i]));
            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }
}