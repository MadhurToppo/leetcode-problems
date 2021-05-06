package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInBSTTest {

    private static KthSmallestElementInBST.Iterative iterative;
    private static KthSmallestElementInBST.Recursive recursive;

    private static TreeNode root;
    private static int k;

    private static int actual;
    private static int expected;

    @BeforeEach
    void setUp() {
        iterative = new KthSmallestElementInBST.Iterative();
        recursive = new KthSmallestElementInBST.Recursive();
    }

    @Test
    void recursive() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,1,4,null,2));

        k = 1;
        actual = recursive.kthSmallest(root, k);
        expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void iterative() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5,3,6,2,4,null,null,1));

        k = 3;
        actual = iterative.kthSmallest(root, k);
        expected = 3;

        assertEquals(expected, actual);
    }
}