package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBinaryTree {

    public static class Recursive {
        public int size(TreeNode root) {
            int sizeLeft = root.left != null ? size(root.left) : 0;
            int sizeRight = root.right != null ? size(root.right) : 0;
            return 1 + sizeLeft + sizeRight;
        }
    }

    public static class Iterative {
        public int size(TreeNode root)  {
            int count = 0;

            if (root == null) {
                return 0;
            }

            Queue<TreeNode> nodes = new LinkedList<>();
            nodes.offer(root);

            while (!nodes.isEmpty()) {
                TreeNode node = nodes.poll();
                count++;

                if (node.left != null) {
                    nodes.offer(node.left);
                }
                if (node.right != null) {
                    nodes.offer(node.right);
                }
            }

            return count;
        }
    }
}
