package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.leetcode.SymmetricTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    private static SymmetricTree.Recursive recursive;
    private static SymmetricTree.Iterative iterative;

    private static TreeNode root;

    private static boolean condition;

    @BeforeEach
    void setUp() {
        recursive = new SymmetricTree.Recursive();
        iterative = new SymmetricTree.Iterative();
    }

    @Test
    void isSymmetricRecursiveTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,3,4,4,3));
        condition = recursive.isSymmetric(root);
        assertTrue(condition);
    }

    @Test
    void isSymmetricRecursiveTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,null,3,4,4,5));
        condition = recursive.isSymmetric(root);
        assertFalse(condition);
    }

    @Test
    void isSymmetricIterativeTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,3,4,4,3));
        condition = iterative.isSymmetric(root);
        assertTrue(condition);
    }

    @Test
    void isSymmetricIterativeTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,null,3,4,4,5));
        condition = iterative.isSymmetric(root);
        assertFalse(condition);
    }
}