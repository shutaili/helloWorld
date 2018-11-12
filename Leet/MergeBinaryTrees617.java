package com.example.neohelloworld.Leet;

import sun.reflect.generics.tree.Tree;

public class MergeBinaryTrees617 {
//    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        Queue<TreeNode> q1 = new LinkedList<>();
//        Queue<TreeNode> q2 = new LinkedList<>();
////        TreeNode tree = new TreeNode(t1.val+t2.val);
//        t1.val =+ t2.val;
//        q1.offer(t1);
//        q2.offer(t2);
//        TreeNode t1c;
//        TreeNode t2c;
//        while(!q1.isEmpty() || !q2.isEmpty()){
//            t1c = q1.poll();
//            t2c = q2.poll();
//
//            if(t1c.left==null && t2c.left!=null){
//                t1c.left = new TreeNode(t2c.left.val);
//            } else if(t1c.left!=null && t2c.left==null){
//                t2c.left = new TreeNode(t1c.left.val);
//            } else if(t1c.left!=null && t2c.left!=null){
//                t1c.left.val+=t2c.left.val;
//            }
//
//            if(t1c.right==null && t2c.right!=null){
//                t1c.right = new TreeNode(t2c.right.val);
//            } else if(t1c.right!=null && t2c.right==null){
//                t2c.right = new TreeNode(t1c.right.val);
//            } else if(t1c.right!=null && t2c.right!=null){
//                t1c.right.val+=t2c.right.val;
//            }
//
//            if(t1c.right!=null && t2c.right!=null){
//                q1.offer(t1c.right);
//                q2.offer(t2c.right);
//            }
//
//            if(t1c.left!=null && t2c.left!= null){
//                q1.offer(t1c.left);
//                q2.offer(t2c.left);
//            }
//        }
//
//        return t1;
//    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) {return null;}
        if(t1==null){
            return t2;
        }if(t2==null){
            return t1;
        }

        TreeNode merged = new TreeNode(t1.val+t2.val);
        merged.left=mergeTrees(t1.left,t2.left);
        merged.right=mergeTrees(t1.right,t2.right);
        return merged;
    }

}

