package com.madhurtoppo.treesandgraphs.ctci.Q402MinimalTree;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.ctci.Q402MinimalTree.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private static Question.Recursive recursive;
    private static int[] nums;

    private static TreeNode actual;
    private static TreeNode expected;

    @BeforeEach
    void setUp() {
        recursive = new Question.Recursive();
    }

    @Test
    void sortedArrayToBSTTest1() {
        nums = new int[]{-10,-3,0,5,9};
        actual = recursive.sortedArrayToBST(nums);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(0,-10,5,null,-3,null,9));
        assertEquals(expected, actual);
    }

    @Test
    void sortedArrayToBSTTest2() {
        nums = new int[]{1,3};
        actual = recursive.sortedArrayToBST(nums);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(1,null,3));
        assertEquals(expected, actual);
    }
}