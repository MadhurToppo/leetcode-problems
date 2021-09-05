package com.madhurtoppo.treesandgraphs.ctci.Q410CheckSubtree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.ctci.Q410CheckSubtree.CheckSubtree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CheckSubtreeTest {

    private static CheckSubtree.Recursive recursive;
    private static TreeNode s;
    private static TreeNode t;

    private static boolean condition;

    @BeforeEach
    void setUp() {
        recursive = new CheckSubtree.Recursive();
    }

    @Test
    void checkSubtreeTest1() {
        s = TreeUtils.constructBinaryTree(Arrays.asList(3,4,5,1,2));
        t = TreeUtils.constructBinaryTree(Arrays.asList(4,1,2));
        condition = recursive.isSubtree(s, t);
        assertTrue(condition);
    }

    @Test
    void checkSubtreeTest2() {
        s = TreeUtils.constructBinaryTree(Arrays.asList(3,4,5,1,2,null,null,null,null,0));
        t = TreeUtils.constructBinaryTree(Arrays.asList(4,1,2));
        condition = recursive.isSubtree(s, t);
        assertFalse(condition);
    }
}