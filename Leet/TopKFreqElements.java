package com.example.neohelloworld.Leet;

import java.util.*;

public class TopKFreqElements {
//    public List<Integer> topKFrequent(int[] nums, int k) {
//        List<Integer> ret = new LinkedList<>();
//        if(nums.length==0) return ret;
//
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for(int num:nums){
//            map.put(num, map.getOrDefault(num,0)+1);
//        }
//
//        while(ret.size()<k){
//            ret.add(findMaxOccurNumber(map));
//        }
//
//        return ret;
//    }
//
//    private int findMaxOccurNumber(Map<Integer, Integer> map){
//        int ret=-1;
//        int max=0;
//        for(Integer key:map.keySet()){
//            if(map.get(key)>=max){
//                max=map.get(key);
//                ret=key;
//            }
//        }
//        if(ret!=-1) map.remove(ret);
//        return ret;
//    }

    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> ret = new LinkedList<>();
        if(nums.length==0) return ret;

        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer>[] bucket = new LinkedList[nums.length + 1];

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Integer key: map.keySet()){
            if(bucket[map.get(key)]==null){
                bucket[map.get(key)]=new LinkedList<>();
            }
            bucket[map.get(key)].add(key);
        }

        for(int i=0;i<bucket.length && ret.size()<k;i++){
            if(bucket[i]!=null) ret.addAll(bucket[i]);
        }

        return ret;
    }

}
