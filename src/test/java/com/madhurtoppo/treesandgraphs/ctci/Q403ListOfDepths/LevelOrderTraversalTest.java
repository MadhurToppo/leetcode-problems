package com.madhurtoppo.treesandgraphs.ctci.Q403ListOfDepths;

import com.madhurtoppo.treesandgraphs.ctci.Q403ListOfDepths.LevelOrderTraversal;
import com.madhurtoppo.commons.leetcode.classes.TreeNode;
import com.madhurtoppo.commons.leetcode.utils.CommonUtils;
import com.madhurtoppo.commons.leetcode.utils.TreeUtils;
import com.madhurtoppo.treesandgraphs.ctci.Q403ListOfDepths.LevelOrderTraversal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

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