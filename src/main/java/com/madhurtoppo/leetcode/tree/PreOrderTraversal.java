package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public static class Recursive {

        public List<Integer> preOrder(TreeNode root) {
            List<Integer> nodeValues = new ArrayList<>();
            return helper(root, nodeValues);
        }

        private List<Integer> helper(TreeNode root, List<Integer> nodeValues) {
            if (root == null) {
                return nodeValues;
            }

            nodeValues.add(root.val);

            helper(root.left, nodeValues);
            helper(root.right, nodeValues);

            return nodeValues;
        }
    }

    public static class Iterative {

        public List<Integer> preOrder(TreeNode root) {

            List<Integer> nodeValues = new ArrayList<>();

            if (root == null) {
                return nodeValues;
            }

            Stack<TreeNode> nodes = new Stack<>();
            nodes.push(root);

            while (!nodes.isEmpty()) {
                TreeNode current = nodes.pop();

                if (current != null) {
                    nodeValues.add(current.val);

                    nodes.push(current.right);
                    nodes.push(current.left);
                }
            }

            return nodeValues;
        }
    }

}