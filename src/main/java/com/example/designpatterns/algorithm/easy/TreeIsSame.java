package com.example.designpatterns.algorithm.easy;

import com.example.designpatterns.algorithm.TreeNode;

public class TreeIsSame {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        if (p.val != q.val){
            return false;
        }
        if (!isSameTree(p.left, q.left)) return false;
        if (!isSameTree(p.right, q.right)) return false;
        return true;
    }

}
