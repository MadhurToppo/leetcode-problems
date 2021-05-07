package com.madhurtoppo.leetcode.tree;

import com.madhurtoppo.leetcode.commons.classes.TreeNode;
import com.madhurtoppo.leetcode.commons.utils.CommonUtils;
import com.madhurtoppo.leetcode.commons.utils.TreeUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTraversalTest {

    private static LevelOrderTraversal.Iterative iterative;

    private static TreeNode root;


    @BeforeEach
    void setUp() {
        iterative = new LevelOrderTraversal.Iterative();
    }

    @Test
    void levelOrderTest1() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(1,2,4));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(iterative.levelOrder(root));
    }

    @Test
    void levelOrderTest2() {
        root = TreeUtils.constructBinaryTree(Arrays.asList(3,9,20,null,null,15,7));
        TreeUtils.printBinaryTree(root);
        CommonUtils.printListList(iterative.levelOrder(root));
    }
}