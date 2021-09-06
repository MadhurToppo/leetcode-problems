package com.madhurtoppo.arrays.leetcode.q217contains_duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean sorting(int[] nums) {

        Arrays.sort(nums);

        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public boolean hashSet(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for (var num : nums) {
            if (!hs.contains(num)) {
                hs.add(num);
            } else {
                return true;
            }
        }

        return false;
    }

}
