package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {

    private static InvertBinaryTree.Recursive recursive;
    private static TreeNode root;

    private static TreeNode actual;
    private static TreeNode expected;

    @BeforeEach
    void setUp() {
        recursive = new InvertBinaryTree.Recursive();
    }

    @Test
    void invertTree() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4,2,7,1,3,6,9));
        actual = recursive.invertTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(4,7,2,9,6,3,1));
        assertEquals(expected, actual);
    }
}