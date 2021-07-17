package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public static class Recursive {

        public List<Integer> inOrder(TreeNode root) {
            ArrayList<Integer> values = new ArrayList<>();
            return helper(root, values);
        }

        private List<Integer> helper(TreeNode root, List<Integer> values) {
            if (root == null) {
                return values;
            }

            helper(root.left, values);
            values.add(root.val);
            helper(root.right, values);

            return values;
        }
    }

    public static class Iterative {

        public List<Integer> inOrder(TreeNode root) {
            ArrayList<Integer> values = new ArrayList<>();
            if (root == null) {
                return values;
            }
            Stack<TreeNode> nodes = new Stack<>();
            while (root != null || !nodes.empty()) {
                while (root != null) {
                    nodes.push(root);
                    root = root.left;
                }
                root = nodes.pop();
                values.add(root.val);
                root = root.right;
            }

            return values;
        }
    }
}