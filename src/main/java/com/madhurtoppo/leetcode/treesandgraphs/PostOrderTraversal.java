package com.madhurtoppo.leetcode.treesandgraphs;

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
            ArrayList<Integer> list = new ArrayList<>();

            if (root == null) {
                return list;
            }

            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(0, node.val);
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }

            return list;
        }
    }
}
