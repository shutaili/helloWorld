package com.example.neohelloworld.Leet;

public class BinaryTreePrunning814 {
    public TreeNode pruneTree(TreeNode root) {
        return dfs(root);
    }

    private TreeNode dfs(TreeNode node){
        if(node == null) return null;

        // TreeNode tree = new TreeNode(node.val);
        node.left = dfs(node.left);
        node.right = dfs(node.right);

        if(node.left==null && node.right==null && node.val==0){
            return null;
        }else{
            return node;
        }
    }

}
