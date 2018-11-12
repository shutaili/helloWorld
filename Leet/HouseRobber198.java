package com.example.neohelloworld.Leet;

import java.util.*;

public class HouseRobber198 {
    public static void main(String[] args) {
        HouseRobber198 houseRobber198 = new HouseRobber198();
        int[] array = {9,-1,-1,-4,-5};

        System.out.println(houseRobber198.rob(array));
    }

    public int rob(int[] nums){
        HashMap<Integer,Integer> list = new HashMap<>();
        allValue(nums,0,0, list);
        return maxValue(list);
    }

    private void allValue(int[] nums, int currIndex, int currValue, HashMap<Integer,Integer> list){
        if(!list.containsKey(currValue) && currIndex!=0){
            System.out.println(currValue);
            list.put(currValue,0);
        }

        for(int i = currIndex; i < nums.length; i++) {
            allValue(nums, i+2, currValue + nums[i], list);
        }
    }

    private int maxValue(HashMap<Integer,Integer> list){
        int ret=0;
        for(int num : list.keySet()){
            ret=Math.max(ret, num);
        }

        return ret;
    }
}
