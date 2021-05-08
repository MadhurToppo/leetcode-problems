package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

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
}
