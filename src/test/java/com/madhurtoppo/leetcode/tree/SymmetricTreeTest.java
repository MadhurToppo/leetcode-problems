package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SymmetricTreeTest {

    private static SymmetricTree.Recursive recursive;
    private static TreeNode root;

    private static boolean condition;

    @BeforeEach
    void setUp() {
        recursive = new SymmetricTree.Recursive();
    }

    @Test
    void isSymmetricTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,3,4,4,3));
        condition = recursive.isSymmetric(root);
        assertTrue(condition);
    }

    @Test
    void isSymmetricTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,null,3,4,4,5));
        condition = recursive.isSymmetric(root);
        assertFalse(condition);
    }
}