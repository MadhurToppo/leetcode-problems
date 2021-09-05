package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

public class SearchInBinaryTree {

    public static class Iterative {

        public boolean searchInBT(TreeNode root, int data) {
            if (root == null) {
                return false;
            }
            if (root.val == data) {
                return true;
            }
            return searchInBT(root.left, data) || searchInBT(root.right, data);
        }
    }
}
