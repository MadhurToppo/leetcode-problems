package com.madhurtoppo.treesandgraphs.ctci.Q404CheckBalanced;

import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.ctci.Q404CheckBalanced.Question;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    private static Question.Recursive recursive;
    private static TreeNode root;

    private static boolean condition;

    @BeforeEach
    void setUp() {
        recursive = new Question.Recursive();
    }

    @Test
    void isBalancedTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,9,20,null,null,15,7));
        condition = recursive.isBalanced(root);
        assertTrue(condition);
    }

    @Test
    void isBalancedTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,2,3,3,null,null,4,4));
        condition = recursive.isBalanced(root);
        assertFalse(condition);
    }
}