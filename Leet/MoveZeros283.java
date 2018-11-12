package com.example.neohelloworld.Leet;

//Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//
//        Example:
//
//        Input: [0,1,0,3,12]
//        Output: [1,3,12,0,0]
//        Note:
//
//        You must do this in-place without making a copy of the array.
//        Minimize the total number of operations.

public class MoveZeros283 {

    public void moveZeroes(int[] nums) {
        int left=0;
        int right=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                left=i;
                right=left+1;
            }
            while(right<nums.length&&nums[right]!=0){
                right++;
            }
            if(right>=nums.length) break;
            swap(nums,left,right);
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}
