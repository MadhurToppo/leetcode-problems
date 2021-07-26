package com.madhurtoppo.ctci.treesandgraphs.Q406InorderSuccessor;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.Stack;

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