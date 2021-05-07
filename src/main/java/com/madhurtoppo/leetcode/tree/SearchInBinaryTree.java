package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

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
