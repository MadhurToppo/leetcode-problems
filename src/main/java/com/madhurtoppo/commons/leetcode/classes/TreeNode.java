package com.madhurtoppo.commons.leetcode.classes;

import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val) {
            return false;
        }

        if (!Objects.equals(left, treeNode.left)) {
            return false;
        }

        return Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        int result = val;

        result = 31 * result + ((left != null) ? left.hashCode() : 0);
        result = 31 * result + ((right != null) ? right.hashCode() : 0);

        return result;
    }

    @Override
    public String toString() {
        return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
