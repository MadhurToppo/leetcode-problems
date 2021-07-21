package com.madhurtoppo.ctci.treesandgraphs.Q402MInimalTree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

public class Question {

    public static class Recursive {
        public TreeNode sortedArrayToBST(int[] nums) {
            return sortedArrayToBST(nums, 0, nums.length - 1);
        }

        private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedArrayToBST(nums, start, mid - 1);
            node.right = sortedArrayToBST(nums, mid + 1, end);
            return node;
        }
    }
}
