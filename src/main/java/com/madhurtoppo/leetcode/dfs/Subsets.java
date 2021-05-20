package com.madhurtoppo.leetcode.dfs;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> getSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(nums, new ArrayList<Integer>(), result, 0);
        return result;
    }

    private void dfs(int[] nums, List<Integer> list, List<List<Integer>> result, int index) {
        result.add(new ArrayList<>(list));
        if (nums.length == list.size()) {
            return;
        }
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(nums, list, result, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
