package com.example.neohelloworld.Leet;

//Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Note: A leaf is a node with no children.
//
//        Example:
//
//        Given binary tree [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        return its depth = 3.

public class MaximumDepthBinaryTree104 {
    public int maxDepth(TreeNode root) {
        return findMaxDepth(root, 0);
    }

    private int findMaxDepth(TreeNode node, int currDepth){
        if(node==null) return 0;

        if(node.right==null && node.left==null){
            return currDepth;
        }

        int result = Math.max(findMaxDepth(node.left,currDepth+1),findMaxDepth(node.right, currDepth+1));

        return result;
    }
}
