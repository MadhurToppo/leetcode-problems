package com.madhurtoppo.arrays.leetcode.q1two_sum;

import java.util.HashMap;
import java.util.Map;

/***
 * [1](https://leetcode.com/problems/two-sum/)
 */
public class TwoSum {

    public int[] brute(int[] nums, int target) {
        for (var i = 0; i < nums.length; i++) {
            for (var j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] onePass(int[] nums, int target) {
        Map<Integer, Integer> indicesByNums = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (indicesByNums.containsKey(complement)) {
                return new int[]{indicesByNums.get(complement), i};
            } else {
                indicesByNums.put(nums[i], i);
            }
        }

        return new int[]{};
    }

}