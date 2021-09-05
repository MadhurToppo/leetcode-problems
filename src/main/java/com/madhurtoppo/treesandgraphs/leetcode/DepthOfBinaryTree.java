package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

public class DepthOfBinaryTree {

    public static class Recursive {
        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return leftDepth > rightDepth ? 1 + leftDepth : 1 + rightDepth;
        }
    }
}
