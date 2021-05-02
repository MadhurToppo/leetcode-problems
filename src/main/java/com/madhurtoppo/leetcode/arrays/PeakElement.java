package com.madhurtoppo.leetcode.arrays;

public class PeakElement {

    public int method2(int[] nums) {
        var left = 0;
        var right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid + 1] < nums[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
