package com.example.neohelloworld.Leet;
//Given a binary tree, determine if it is a valid binary search tree (BST).
//
//        Assume a BST is defined as follows:
//
//        The left subtree of a node contains only nodes with keys less than the node's key.
//        The right subtree of a node contains only nodes with keys greater than the node's key.
//        Both the left and right subtrees must also be binary search trees.

import java.util.ArrayList;
import java.util.List;

public class ValidateBST98 {
    public boolean isBalanced=true;

    public boolean isValidBST(TreeNode root) {
        validate(root, null);
        return isBalanced;
    }

    private void validate(TreeNode node, Integer prev){
        if(node==null){
            return;
        }

        validate(node.left, node.val);
        if(prev!=null && node.val <= prev){
            isBalanced=false;
        }
        validate(node.right, node.val);

    }


//    public boolean isValidBST(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        fill(root, list);
//        return isAsc(list);
//    }
//
//    private void fill(TreeNode node, List<Integer> list){
//        if(node==null){
//            return;
//        }
//        fill(node.left,list);
//        list.add(node.val);
//        fill(node.right,list);
//    }
//
//    private boolean isAsc(List<Integer> list){
//        for(int i=1; i<list.size(); i++){
//            if(list.get(i-1)>=list.get(i)){
//                return false;
//            }
//        }
//        return true;
//    }
}
