package com.madhurtoppo.leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer, Integer> hm = new HashMap<>();

        for (var i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (!hm.containsKey(complement)) {
                hm.put(nums[i], i);
            } else {
                return new int[]{hm.get(complement), i};
            }
        }
        return new int[]{};
    }

}