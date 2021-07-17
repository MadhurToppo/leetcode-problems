package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

    public static class Recursive {
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            }
            if (left == null || right == null) {
                return false;
            }
            return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }

    public static class Iterative {
        public boolean isSymmetric(TreeNode root) {
            Queue<TreeNode> nodes = new LinkedList<>();

            nodes.add(root);
            nodes.add(root);

            while (!nodes.isEmpty()) {
                TreeNode left = nodes.poll();
                TreeNode right = nodes.poll();

                if (left == null && right == null) {
                    continue;
                }
                if (left == null || right == null) {
                    return false;
                }
                if (left.val != right.val) {
                    return false;
                }
                nodes.add(left.left);
                nodes.add(right.right);
                nodes.add(left.right);
                nodes.add(right.left);
            }
            return true;
        }
    }
}
