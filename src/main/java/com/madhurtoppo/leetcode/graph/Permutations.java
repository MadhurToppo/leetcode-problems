package com.madhurtoppo.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        permuteRecur(nums, new ArrayList<>(), result, new boolean[nums.length]);
        return result;
    }

    private void permuteRecur(int[] nums, List<Integer> list, List<List<Integer>> result, boolean[] used) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            list.add(nums[i]);
            used[i] = true;
            permuteRecur(nums, list, result, used);
            used[i] = false;
            list.remove(list.size() - 1);
        }
    }
}
