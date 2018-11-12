package com.example.neohelloworld.Leet;

import java.util.HashMap;

public class NumArraySums303 {
    private int[] sum;

    public NumArraySums303(int[] nums) {
        sum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                sum[i]=nums[i];
            }else{
                sum[i]=sum[i-1]+nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return sum[j];

        return sum[j]-sum[i];
    }

}
