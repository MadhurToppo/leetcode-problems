package com.madhurtoppo.treesandgraphs.ctci.Q403ListOfDepths;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static class Iterative {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();

            if (root == null) {
                return result;
            }

            Queue<TreeNode> nodes = new LinkedList<>();
            nodes.offer(root);

            while (!nodes.isEmpty()) {
                int size = nodes.size();
                List<Integer> values = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode node = nodes.poll();
                    values.add(node.val);
                    if (node.left != null) {
                        nodes.offer(node.left);
                    }
                    if (node.right != null) {
                        nodes.offer(node.right);
                    }
                }
                result.add(values);
            }
            return result;
        }
    }
}
