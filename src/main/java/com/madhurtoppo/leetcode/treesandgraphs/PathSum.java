package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {

    public static class Recursive {

        public List<List<Integer>> rootToLeafPathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            rootToLeafPathSum(list, result, root, targetSum);
            return result;
        }

        private void rootToLeafPathSum(List<Integer> list, List<List<Integer>> result, TreeNode root, int targetSum) {
            if (root == null) {
                return;
            }
            list.add(root.val);
            if (root.left == null && root.right == null && root.val == targetSum) {
                result.add(new ArrayList<Integer>(list));
            }
            rootToLeafPathSum(list, result, root.left, targetSum - root.val);
            rootToLeafPathSum(list, result, root.right, targetSum - root.val);
            list.remove(list.size() - 1);
        }
    }
}
