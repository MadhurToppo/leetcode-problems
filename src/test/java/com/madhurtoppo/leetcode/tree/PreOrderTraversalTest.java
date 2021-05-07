package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTraversalTest {

    private static PreOrderTraversal.Recursive recursive;
    private static PreOrderTraversal.Iterative iterative;

    private static TreeNode root;

    private static List<Integer> actual;
    private static List<Integer> expected;

    @BeforeAll
    public static void setup() {
        recursive = new PreOrderTraversal.Recursive();
        iterative = new PreOrderTraversal.Iterative();
    }

    @Test
    void recursive() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,1,null,null,5,2,null,null,4));

        actual = recursive.preOrder(root);
        expected = Arrays.asList(3, 1, 5, 2, 4);

        assertEquals(expected, actual);
    }

    @Test
    void iterative() {
        root =  TreeUtils.constructBinaryTree(Arrays.asList(1, 2, 3, 4, null, 5, 6, null, 7, null, null, null, null, 8, 9));

        actual = iterative.preOrder(root);
        expected = Arrays.asList(1, 2, 4, 7, 8, 9, 3, 5, 6);

        assertEquals(actual, expected);
    }
}