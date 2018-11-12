package com.example.neohelloworld.Leet;

public class DiameterOfBinaryTrees543 {

    int length=0;
    public int diameterOfBinaryTree(TreeNode root) {
        findDiameter(root);
        return length;
    }

    private int findDiameter(TreeNode root){
        if(root==null){
            return 0;
        }

        int left = findDiameter(root.left);
        int right = findDiameter(root.right);

        int leftPath=0;
        int rightPath=0;

        if(root.left!=null){
            leftPath = left +1;
        }
        if(root.right!=null){
            rightPath = right +1;
        }

        length = Math.max(length, leftPath+rightPath);

        return Math.max(leftPath, rightPath);
    }
}
