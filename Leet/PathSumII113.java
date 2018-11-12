package com.example.neohelloworld.Leet;

import java.util.LinkedList;
import java.util.List;

public class PathSumII113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new LinkedList<>();
        findPath(root, sum, new LinkedList<>(), result);
        return result;
    }

    private void findPath(TreeNode node, int sum, LinkedList<Integer> currentPath, List<List<Integer>> result){
        if(node==null) return;
        currentPath.addLast(node.val);

        if(node.left==null && node.right==null) {
            if(sum-node.val == 0) result.add(currentPath);
            currentPath.removeLast();
        }

        findPath(node.left, sum-node.val, currentPath,result);
        findPath(node.right, sum-node.val, currentPath,result);
    }

}
