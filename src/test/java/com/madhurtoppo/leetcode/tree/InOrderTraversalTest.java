package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InOrderTraversalTest {

    private static InOrderTraversal.Recursive recursive;
    private static InOrderTraversal.Iterative iterative;

    private static TreeNode root;

    private static List<Integer> actual;
    private static List<Integer> expected;

    @BeforeEach
    void setUp() {
        recursive = new InOrderTraversal.Recursive();
        iterative = new InOrderTraversal.Iterative();
    }

    @Test
    void recursive() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,null,2,3));

        actual = recursive.inOrder(root);
        expected = new ArrayList<>(Arrays.asList(1, 3, 2));

        assertEquals(expected, actual);
    }

    @Test
    void iterative() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,null,2,3));

        actual = iterative.inOrder(root);
        expected = new ArrayList<>(Arrays.asList(1, 3, 2));

        assertEquals(expected, actual);
    }
}