package com.madhurtoppo.leetcode.arrays;

public class BinarySearch {

    public int method1(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
