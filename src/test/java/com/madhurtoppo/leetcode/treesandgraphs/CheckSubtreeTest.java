package com.madhurtoppo.leetcode.treesandgraphs;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

class CheckSubtreeTest {

    private static SameTree.Recursive recursive;

    private static TreeNode p;
    private static TreeNode q;

    private static boolean condition;

    @BeforeEach
    void setUp() {
        recursive = new SameTree.Recursive();
    }

    @Test
    void recursiveTest1() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,null,null,5,6));
        q = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,null,null,5,6));

        condition = recursive.isSameTree(p, q);

        assertTrue(condition);
    }

    @Test
    void recursiveTest2() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,null,null,5,6));
        q = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,null,null,5,7));

        condition = recursive.isSameTree(p, q);

        assertFalse(condition);
    }

    @Test
    void recursiveTest3() {
        p = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,null,null,5,6));
        q = TreeUtils.constructBinaryTree(Arrays.asList(1,2,3,4,null,null,7));

        condition = recursive.isSameTree(p, q);

        assertFalse(condition);
    }
}