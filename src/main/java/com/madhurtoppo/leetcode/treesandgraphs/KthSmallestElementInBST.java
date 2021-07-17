package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class KthSmallestElementInBST {

    public static class Recursive {
        public int kthSmallest(TreeNode root,  int k) {
            ArrayList<Integer> values = new ArrayList<>();
            helper(root, values);
            return values.get(k - 1);
        }

        private void helper(TreeNode root, ArrayList<Integer> values) {
            if (root == null) {
                return;
            }
            helper(root.left, values);
            values.add(root.val);
            helper(root.right, values);
        }
    }

    public static class Iterative {
        public int kthSmallest(TreeNode root, int k) {
            Stack<TreeNode> nodes = new Stack<>();

            while (root != null || !nodes.isEmpty()) {
                while (root != null) {
                    nodes.push(root);
                    root = root.left;
                }
                root = nodes.pop();
                if (--k == 0) {
                    break;
                }
                root = root.right;
            }

            return root.val;
        }
    }
}
