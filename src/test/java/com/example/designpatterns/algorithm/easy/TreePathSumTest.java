package com.example.designpatterns.algorithm.easy;

import com.example.designpatterns.algorithm.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreePathSumTest {

    @Test
    void hasPathSum() {
        Integer[] root = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        TreeNode treeNode = TreeNode.buildTreeFromArray(root);
        Assertions.assertTrue(TreePathSum.hasPathSum(treeNode, 22));
    }
}