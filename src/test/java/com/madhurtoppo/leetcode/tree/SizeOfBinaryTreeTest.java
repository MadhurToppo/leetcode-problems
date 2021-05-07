package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SizeOfBinaryTreeTest {

    private static SizeOfBinaryTree.Recursive recursive;
    private static SizeOfBinaryTree.Iterative iterative;

    private static TreeNode root;

    private static int actual;
    private static int expected;


    @BeforeEach
    void setUp() {
        recursive = new SizeOfBinaryTree.Recursive();
        iterative = new SizeOfBinaryTree.Iterative();
    }

    @Test
    void recursiveTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,5,6));
        actual = recursive.size(root);
        expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void recursiveTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,null,null,3,4,5));
        actual = recursive.size(root);
        expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,5,6,7));
        actual = iterative.size(root);
        expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void iterativeTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,null,null,3,4,5,6,7,8));
        actual = iterative.size(root);
        expected = 8;
        assertEquals(expected, actual);
    }

}