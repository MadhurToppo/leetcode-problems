package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

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
