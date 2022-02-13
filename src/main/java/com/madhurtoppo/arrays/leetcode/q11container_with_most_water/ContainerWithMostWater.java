package com.madhurtoppo.arrays.leetcode.q11container_with_most_water;

/**
 * [11](https://leetcode.com/problems/container-with-most-water/)
 */
public class ContainerWithMostWater {
    public int twoPointer(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;

        while (i < j) {
            int x = j - i;
            int y = Math.min(height[i], height[j]);
            int volume = y * x;

            max = Math.max(max, volume);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }
}
