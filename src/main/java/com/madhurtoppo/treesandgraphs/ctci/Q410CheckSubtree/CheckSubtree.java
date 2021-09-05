package com.madhurtoppo.treesandgraphs.ctci.Q410CheckSubtree;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;

public class CheckSubtree {
    public static class Recursive {
        public boolean isSubtree(TreeNode s, TreeNode t) {
            if (isSame(s, t)) {
                return true;
            }
            if (s == null || t == null) {
                return false;
            }
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }

        private boolean isSame(TreeNode p, TreeNode q) {
            if (p == null && q == null) {
                return true;
            }

            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            return isSame(p.left, q.left) && isSame(p.right, q.right);
        }
    }
}
