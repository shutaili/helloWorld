package com.example.neohelloworld.Leet;

//Given a sorted integer array without duplicates, return the summary of its ranges.
//
//        Example 1:
//
//        Input:  [0,1,2,4,5,7]
//        Output: ["0->2","4->5","7"]
//        Explanation: 0,1,2 form a continuous range; 4,5 form a continuous range.
//        Example 2:
//
//        Input:  [0,2,3,4,6,8,9]
//        Output: ["0","2->4","6","8->9"]
//        Explanation: 2,3,4 form a continuous range; 8,9 form a continuous range.


import java.util.ArrayList;
import java.util.List;

public class SummaryRangeds228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int left=0;
        int right=0;

        while(right<nums.length){
            if(right+1==nums.length){
                result.add(left==right ? String.valueOf(nums[left]) : nums[left]+"->"+nums[right]);
            } else if(nums[right+1]-nums[right]>1){
                result.add(left==right ? String.valueOf(nums[left]) : nums[left]+"->"+nums[right]);
                left=right+1;
            }

            right++;
        }

        return result;

    }
}
