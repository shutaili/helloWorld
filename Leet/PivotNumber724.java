package com.example.neohelloworld.Leet;

public class PivotNumber724 {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0) leftSum+= nums[i-1];
            if(i!=nums.length-1) rightSum+= nums[i+1];
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }

    private int leftSum(int index, int[] nums){
        int sum=0;
        for(int i=index-1;i>=0;i--){
            sum+=nums[i];
        }
        return sum;
    }

    private int rightSum(int index,int[] nums){
        int sum=0;
        for(int i=index+1;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

}
