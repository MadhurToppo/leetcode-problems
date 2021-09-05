package com.madhurtoppo.treesandgraphs.ctci.Q406InorderSuccessor;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

public class Question {
    public static class Iterative {
        public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
            TreeNode successor = null;
            while (root != null) {
                if (root.val > p.val) {
                    successor = root;
                    root = root.left;
                } else {
                    root = root.right;
                }
            }
            return successor;
        }
    }
}