package com.madhurtoppo.arrays.leetcode.q11container_with_most_water;

public class ContainerWithMostWater {
    public int twoPointer(int[] height) {
        var i = 0;
        var j = height.length - 1;

        var max = 0;

        while (i < j) {
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
