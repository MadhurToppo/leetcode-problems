package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static class Recursive {

        public List<Integer> postOrder(TreeNode root) {
            ArrayList<Integer> nodeValues = new ArrayList<>();
            return helper(root, nodeValues);
        }

        private List<Integer> helper(TreeNode root, List<Integer> nodeValues) {
            if (root == null) {
                return nodeValues;
            }

            helper(root.left, nodeValues);
            helper(root.right, nodeValues);
            nodeValues.add(root.val);

            return nodeValues;
        }
    }

    public static class Iterative {

        public List<Integer> postOrder(TreeNode root) {
            ArrayList<Integer> nodeValues = new ArrayList<>();

            if (root == null) {
                return nodeValues;
            }

            Stack<TreeNode> nodes = new Stack<>();
            nodes.push(root);

            while (!nodes.isEmpty()) {
                TreeNode current = nodes.pop();

                if (current != null) {
                    nodes.push(current.left);

                    nodes.push(current.right);
                    nodeValues.add(0, current.val);
                }
            }

            return nodeValues;
        }
    }
}
