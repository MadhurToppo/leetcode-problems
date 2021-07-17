package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SearchInBinaryTreeTest {

    private static SearchInBinaryTree.Iterative iterative;
    private static TreeNode root;
    private static int data;

    private static boolean condition;

    @BeforeEach
    void setUp() {
        iterative = new SearchInBinaryTree.Iterative();
    }

    @Test
    void searchInBTTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,1,null,null,5,2,null,null,4));
        data = 5;
        condition = iterative.searchInBT(root, data);
        assertTrue(condition);
    }

    @Test
    void searchInBTTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,1,null,null,5,2,null,null,4));
        data = 7;
        condition = iterative.searchInBT(root, data);
        assertFalse(condition);
    }
}