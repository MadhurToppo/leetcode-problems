package com.madhurtoppo.leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combination(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        dfs( candidates, new ArrayList<Integer>(), result,0, target);
        return result;
    }

    private void dfs(int[] candidates, List<Integer> list, List<List<Integer>> result, int index, int target) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            dfs(candidates, list, result, i, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }
}