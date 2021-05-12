package com.madhurtoppo.leetcode.greedy;

public class SelectionSort {
    public int[] selection(int[] nums) {
        int i;
        int j;
        int minIndex;

        for (i = 0; i < nums.length; i++) {
            minIndex = i;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }
}
