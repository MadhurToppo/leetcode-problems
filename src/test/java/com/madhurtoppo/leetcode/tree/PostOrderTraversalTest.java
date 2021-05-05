package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostOrderTraversalTest {

    private static PostOrderTraversal.Recursive recursive;
    private static PostOrderTraversal.Iterative iterative;
    private static TreeNode root;

    private static List<Integer> actual;
    private static List<Integer> expected;

    @BeforeEach
    void setUp() {
        recursive = new PostOrderTraversal.Recursive();
        iterative = new PostOrderTraversal.Iterative();
    }

    @Test
    void recursive() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));

        actual = recursive.postOrder(root);
        expected = new ArrayList<>(Arrays.asList(8, 9, 7, 4, 2, 5, 6, 3, 1));

        assertEquals(expected, actual);
    }

    @Test
    void iterative() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));

        actual = iterative.postOrder(root);
        expected = new ArrayList<>(Arrays.asList(8, 9, 7, 4, 2, 5, 6, 3, 1));

        assertEquals(expected, actual);
    }
}