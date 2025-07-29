package com.example.designpatterns.algorithm.easy;

import com.example.designpatterns.algorithm.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeIsSameTest {

    @Test
    void isSameTree1() {
        Integer[] p = new Integer[]{1,2,3};
        Integer[] q = new Integer[]{1,2,3};

        TreeNode pTree = TreeNode.buildTreeFromArray(p);
        TreeNode qTree = TreeNode.buildTreeFromArray(q);

        Assertions.assertTrue(TreeIsSame.isSameTree(pTree, qTree));

    }
}