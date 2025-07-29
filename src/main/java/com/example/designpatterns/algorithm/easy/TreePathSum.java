package com.example.designpatterns.algorithm.easy;

import com.example.designpatterns.algorithm.TreeNode;

public class TreePathSum {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        return solve(root, targetSum, 0);
    }

    public static boolean solve(TreeNode root, int targetSum, int currentSum){
        if (isLeaf(root)){
            return currentSum + root.val == targetSum;
        }
        if (root.left != null){
            if (solve(root.left, targetSum, currentSum + root.val)){
                return true;
            };
        }
        if (root.right != null){
            if (solve(root.right, targetSum, currentSum + root.val)){
                return true;
            };
        }
        return false;
    }

    private static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
}
