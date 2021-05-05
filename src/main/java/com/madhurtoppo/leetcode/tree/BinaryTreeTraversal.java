package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTraversal {

    public static class preOrder {

        public List<Integer> recursive(TreeNode root) {
            List<Integer> nodes = new ArrayList<>();
            return dfs(root, nodes);
        }

        private List<Integer> dfs(TreeNode root, List<Integer> nodes) {
            if (root == null) {
                return nodes;
            }

            nodes.add(root.val);
            dfs(root.left, nodes);
            dfs(root.right, nodes);

            return nodes;
        }


        public List<Integer> iterative(TreeNode root) {
            List<Integer> nodes = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();

            stack.push(root);

            while (!stack.isEmpty()) {
                TreeNode current = stack.pop();

                if (current != null) {
                    nodes.add(current.val);
                    stack.push(current.right);
                    stack.push(current.left);
                }
            }

            return nodes;
        }


    }
    
    

}
