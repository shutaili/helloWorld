package com.example.neohelloworld.Leet;

//Given a binary tree, return the inorder traversal of its nodes' values.

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTraversal94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currNode = root;

        while(currNode!=null || !stack.isEmpty()){
            while(currNode!=null) {
                stack.push(currNode);
                currNode=currNode.left;
            }
            currNode = stack.pop();
            result.add(currNode.val);
            currNode = currNode.right;
        }

        return result;
    }

//    private void dfs(TreeNode node, LinkedList<Integer> result){
//        if(node==null) return;
//
//        dfs(node.left,result);
//        result.addFirst(node.val);
//        dfs(node.right, result);
//    }

}
