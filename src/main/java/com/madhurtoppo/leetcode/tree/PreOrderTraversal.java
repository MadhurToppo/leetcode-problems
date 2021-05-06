package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {

    public static class Recursive {

        public List<Integer> preOrder(TreeNode root) {
            List<Integer> values = new ArrayList<>();
            return helper(root, values);
        }

        private List<Integer> helper(TreeNode root, List<Integer> values) {
            if (root == null) {
                return values;
            }

            values.add(root.val);

            helper(root.left, values);
            helper(root.right, values);

            return values;
        }
    }

    public static class Iterative {

        public List<Integer> preOrder(TreeNode root) {

            List<Integer> values = new ArrayList<>();

            if (root == null) {
                return values;
            }

            Stack<TreeNode> nodes = new Stack<>();
            nodes.push(root);

            while (!nodes.isEmpty()) {

                TreeNode node = nodes.pop();
                values.add(node.val);

                if (node.right != null) {
                    nodes.push(node.right);
                }

                if (node.left != null) {
                    nodes.push(node.left);
                }
            }

            return values;
        }
    }

}