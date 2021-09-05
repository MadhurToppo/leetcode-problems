package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DepthOfBinaryTreeTest {

    private static DepthOfBinaryTree.Recursive recursive;

    private static TreeNode root;

    private static int actual;
    private static int expected;

    @BeforeEach
    void setUp() {
        recursive = new DepthOfBinaryTree.Recursive();
    }

    @Test
    void recursiveMaxDepth() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,9,20,null,null,15,7));

        actual = recursive.maxDepth(root);
        expected = 3;

        assertEquals(expected, actual);
    }
}