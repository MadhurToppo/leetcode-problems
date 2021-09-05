package com.madhurtoppo.treesandgraphs.ctci.Q408FirstCommonAncestor;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.ctci.Q408FirstCommonAncestor.LCA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LCATest {

    private static LCA.Iterative iterative;
    private static TreeNode root;
    private static TreeNode p;
    private static TreeNode q;
    private static TreeNode actual;
    private static TreeNode expected;

    @BeforeEach
    void setUp() {
        iterative = new LCA.Iterative();
    }

    @Test
    void lowestCommonAncestorTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4));
        p = TreeUtils.constructBinaryTree(Arrays.asList(5,6,2,null,null,7,4));
        q = TreeUtils.constructBinaryTree(Arrays.asList(1,0,8));

        actual = iterative.lowestCommonAncestor(root, p, q);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4));

        assertEquals(expected, actual);
    }

    @Test
    void lowestCommonAncestorTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,5,1,6,2,0,8,null,null,7,4));
        p = TreeUtils.constructBinaryTree(Arrays.asList(5,6,2,null,null,7,4));
        q = TreeUtils.constructBinaryTree(Arrays.asList(4));

        actual = iterative.lowestCommonAncestor(root, p, q);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(5,6,2,null,null,7,4));

        assertEquals(expected, actual);
    }
}