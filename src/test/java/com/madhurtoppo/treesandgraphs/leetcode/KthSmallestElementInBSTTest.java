package com.madhurtoppo.treesandgraphs.leetcode;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.leetcode.KthSmallestElementInBST;
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
    void recursiveKthSmall() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,1,4,null,2));

        k = 1;
        actual = recursive.kthSmallest(root, k);
        expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    void iterativeKthSmall() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5,3,6,2,4,null,null,1));

        k = 3;
        actual = iterative.kthSmallest(root, k);
        expected = 3;

        assertEquals(expected, actual);
    }
}