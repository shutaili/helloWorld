package com.example.neohelloworld.Leet;
//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
//
//        Note:
//
//        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//
//        Example 1:
//
//        Input: [2,2,1]
//        Output: 1
//        Example 2:
//
//        Input: [4,1,2,1,2]
//        Output: 4

import java.util.HashSet;

public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int result = 0;

        for(int i=0;i<nums.length;i++){
            if(!set.contains(i)) {
                set.add(i);
                result +=i;
            } else{
                result-=i;
            }
        }

        return result;

    }

}
