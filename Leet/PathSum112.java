package com.example.neohelloworld.Leet;

public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null) return false;
        return dfs(root,sum);
    }

    private boolean dfs(TreeNode root, int sum){
        if(root==null) return false;

        if(root.left==null && root.right==null){
            return sum-root.val==0;
        }

        return dfs(root.left,sum-root.val) || dfs(root.right, sum-root.val);
    }

}
