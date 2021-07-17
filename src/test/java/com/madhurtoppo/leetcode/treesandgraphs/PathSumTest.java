package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {

    private static PathSum.Recursive recursive;
    private static TreeNode root;
    private static int targetSum;

    private static List<List<Integer>> actual;
    private static List<List<Integer>> expected;

    @BeforeEach
    void setUp() {
        recursive = new PathSum.Recursive();
    }

    @Test
    void pathSumTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(5,4,8,11,null,13,4,7,2,null,null,5,1));
        targetSum = 22;

        actual = recursive.rootToLeafPathSum(root, targetSum);
        expected = new ArrayList<>();
        expected.add(Arrays.asList(5,4,11,2));
        expected.add(Arrays.asList(5,8,4,5));

        assertEquals(expected, actual);
    }

    @Test
    void pathSumTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,5,3,4));
        targetSum = 6;

        actual = recursive.rootToLeafPathSum(root, targetSum);
        expected = new ArrayList<>();
        expected.add(Arrays.asList(1,2,3));
        expected.add(Arrays.asList(1,5));

        assertEquals(expected, actual);
    }
}