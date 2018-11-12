package com.example.neohelloworld;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum {

    public static void main(String[] args){

    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new LinkedList<>();
        int left=0;

        while(left<nums.length){

            int middle = left+1;
            int right = nums.length-1;

            if(left==0 || nums[left]!=nums[left-1]){
                while(middle<right){
                    int sum = nums[left] + nums[right] + nums[middle];

                    if(sum>0){
                        right--;
                    }
                    if(sum<0){
                        middle++;
                    }
                    if(sum==0){
                        List<Integer> outputSet = new LinkedList<>();
                        outputSet.add(nums[left]);
                        outputSet.add(nums[middle]);
                        outputSet.add(nums[right]);
                        ret.add(outputSet);
                        middle++;
                        while(middle<right && nums[middle]==nums[middle-1]){
                            middle ++;
                        }
                    }
                }
            }
            left++;
        }

        return ret;
    }

}

