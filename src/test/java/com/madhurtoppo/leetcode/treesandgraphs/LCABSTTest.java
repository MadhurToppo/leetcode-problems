package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class LCABSTTest {

    private static LCABST.Recursive recursive;

    private static TreeNode root;
    private static TreeNode p;
    private static TreeNode q;

    private static TreeNode actual;
    private static TreeNode expected;

    @BeforeEach
    void setUp() {
        recursive = new LCABST.Recursive();
    }

    @Test
    void lowestCommonAncestorTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(6,2,8,0,4,7,9,null,null,3,5));
        p = TreeUtils.constructBinaryTree(Arrays.asList(2,0,4,null,null,3,5));
        q = TreeUtils.constructBinaryTree(Arrays.asList(8,7,9));

        actual = recursive.lowestCommonAncestor(root, p , q);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(6,2,8,0,4,7,9,null,null,3,5));

        assertEquals(expected, actual);
    }

    @Test
    void lowestCommonAncestorTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(6,2,8,0,4,7,9,null,null,3,5));

        p = TreeUtils.constructBinaryTree(Arrays.asList(2,0,4,null,null,3,5));
        q = TreeUtils.constructBinaryTree(Arrays.asList(4,3,5));

        actual = recursive.lowestCommonAncestor(root, p , q);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(2,0,4,null,null,3,5));

        assertEquals(expected, actual);
    }
}