package com.example.neohelloworld.Leet;

import java.util.HashMap;

public class MajorityElement169 {
//    public int majorityElement(int[] nums) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<nums.length;i++){
//            if(!map.containsKey(nums[i])) {
//                map.put(nums[i], 1);
//            } else {
//                map.put(nums[i], map.get(nums[i]) + 1);
//            }
//        }
//
//        int ret=0;
//        int maxCount=0;
//
//        for(Integer key:map.keySet()){
//            if(map.get(key)>maxCount){
//                ret=key;
//            }
//        }
//
//        return ret;
//    }

    // Boye-Moore Voting
    public int majorityElement(int[] nums) {
        int count=0;
        int majority=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                majority=nums[i];
                count=1;
            } else{
                if(nums[i]==majority) {
                    count+=1;
                } else{
                    count-=1;
                }
            }
        }

        return majority;
    }

}
