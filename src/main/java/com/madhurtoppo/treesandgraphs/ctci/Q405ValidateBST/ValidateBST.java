package com.madhurtoppo.treesandgraphs.ctci.Q405ValidateBST;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.Stack;

public class ValidateBST {
    public static class Iterative {
        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }
            Stack<TreeNode> nodes = new Stack<>();
            TreeNode previous = null;
            while (root != null || !nodes.isEmpty()) {
                while (root != null) {
                    nodes.push(root);
                    root = root.left;
                }
                root = nodes.pop();
                if (previous != null && previous.val >= root.val) {
                    return false;
                }
                previous = root;
                root = root.right;
            }
            return true;
        }
    }
}