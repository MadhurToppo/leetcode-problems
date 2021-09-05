package com.madhurtoppo.arrays.leetcode;

public class MinInRotatedSorted {

    public int method2(int[] nums) {
        var left = 0;
        var right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[right]) {
               right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}
