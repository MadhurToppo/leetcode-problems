package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.leetcode.InvertBinaryTree;
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
    void recursiveInvertTree() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(4,2,7,1,3,6,9));
        actual = recursive.invertTree(root);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(4,7,2,9,6,3,1));
        assertEquals(expected, actual);
    }
}