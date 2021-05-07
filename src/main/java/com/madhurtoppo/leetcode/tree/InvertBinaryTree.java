package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

public class InvertBinaryTree {

    public static class Recursive {
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode temp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(temp);
            return root;
        }
    }
}
