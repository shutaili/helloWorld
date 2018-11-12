package com.example.neohelloworld.Leet;

import java.util.Stack;

public class AstroidCollision735 {

    public int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length == 1){
            return asteroids;
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[0]);

        for(int i=1;i<asteroids.length;i++){
            Integer currentAstroid= asteroids[i];
            while(!stack.isEmpty() && currentAstroid!=null && isGoingToCollide(stack.peek(), currentAstroid)){
                if(isAbsRightGreaterThanLeft(stack.peek(), currentAstroid)){
                    stack.pop();
                } else if(Math.abs(stack.peek()) == Math.abs(currentAstroid)){
                    stack.pop();
                    currentAstroid=null;
                } else{
                    currentAstroid=null;
                }
            }
            if(currentAstroid!=null) stack.push(currentAstroid);
        }

        int[] ret = new int[stack.size()];

        for(int i=ret.length-1;i>=0;i--){
            ret[i]=stack.pop();
        }

        return ret;
    }

    private boolean isGoingToCollide(int left, int right){
        return left>=0 && right < 0;
    }

    private boolean isAbsRightGreaterThanLeft(int left, int right){
        return Math.abs(right) - Math.abs(left) > 0;
    }

}
