package com.madhurtoppo.ctci.treesandgraphs.Q406InorderSuccessor;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private static Question.Iterative iterative;
    private static TreeNode root;
    private static TreeNode p;

    private static TreeNode expected;
    private static TreeNode actual;

    @BeforeEach
    void setUp() {
        iterative = new Question.Iterative();

    }

    @Test
    void inorderSuccessorTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(7,4,10,2,6,8,12,null,null,5));
        p = TreeUtils.constructBinaryTree(Arrays.asList(5));
        actual = iterative.inorderSuccessor(root, p);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(6,5));
        assertEquals(expected, actual);
    }

    @Test
    void inorderSuccessorTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(2,1,3));
        p = TreeUtils.constructBinaryTree(Arrays.asList(1));
        actual = iterative.inorderSuccessor(root, p);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(2,1,3));
        assertEquals(expected, actual);
    }

    @Test
    void inorderSuccessorTest3() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(7,4,10,2,6,8,12,null,null,5));
        p = TreeUtils.constructBinaryTree(Arrays.asList(8));
        actual = iterative.inorderSuccessor(root, p);
        expected = TreeUtils.constructBinaryTree(Arrays.asList(10,8,12));
        assertEquals(expected, actual);
    }
}