package com.example.neohelloworld.Leet;

public class PathToSumIII437 {
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        return findAllResult(root,sum) + pathSum(root.left, sum) + pathSum(root.right,sum);
    }

    private int findAllResult(TreeNode node, int sum){
        int result=0;

        if(node==null){
            return 0;
        }

        if(node.val==sum){
            result++;
        }

        result+=findAllResult(node.left, sum-node.val);
        result+=findAllResult(node.right, sum-node.val);

        return result;
    }

}
