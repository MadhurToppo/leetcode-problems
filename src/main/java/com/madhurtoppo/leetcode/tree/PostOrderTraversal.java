package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {

    public static class Recursive {

        public List<Integer> postOrder(TreeNode root) {
            ArrayList<Integer> values = new ArrayList<>();
            return helper(root, values);
        }

        private List<Integer> helper(TreeNode root, List<Integer> values) {
            if (root == null) {
                return values;
            }

            helper(root.left, values);
            helper(root.right, values);
            values.add(root.val);

            return values;
        }
    }

    public static class Iterative {

        public List<Integer> postOrder(TreeNode root) {
            ArrayList<Integer> values = new ArrayList<>();

            if (root == null) {
                return values;
            }

            Stack<TreeNode> nodes = new Stack<>();
            nodes.push(root);

            while (!nodes.isEmpty()) {

                TreeNode node = nodes.pop();
                values.add(0, node.val);

                if (node.left != null) {
                    nodes.push(node.left);
                }

                if (node.right != null) {
                    nodes.push(node.right);
                }
            }

            return values;
        }
    }
}
