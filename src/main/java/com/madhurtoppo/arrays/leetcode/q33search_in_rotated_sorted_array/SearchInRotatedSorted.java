package com.madhurtoppo.arrays.leetcode.q33search_in_rotated_sorted_array;

public class SearchInRotatedSorted {

    public int method2n1(int[] nums, int target) {
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

        int minPos = left;
        left = 0;
        right = nums.length - 1;

        if (target >= nums[minPos] && target <= nums[right]) {
            left = minPos;
        } else {
            right = minPos;
        }

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

