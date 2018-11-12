package com.example.neohelloworld.Leet;

public class LongestUniValuePath687 {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(1);

        LongestUniValuePath687 longestUniValuePath687 = new LongestUniValuePath687();

        System.out.println(longestUniValuePath687.longestUnivaluePath(treeNode));
    }

    int length=0;
    public int longestUnivaluePath(TreeNode root) {
        findLongestPath(root, root.val);
        return length;
    }

    private int findLongestPath(TreeNode root, int val){
        if(root==null){
            return 0;
        }

        int left = findLongestPath(root.left, root.val);
        int right = findLongestPath(root.right, root.val);

        int leftPath=0;
        int rightPath=0;

        if(root.left!=null && root.left.val==val){
            leftPath = left+1;
        }
        if(root.right!=null && root.right.val==val){
            rightPath = right+1;
        }

        length = Math.max(length, leftPath+rightPath);

        return Math.max(leftPath, rightPath);
    }

}