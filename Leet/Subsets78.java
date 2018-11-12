package com.example.neohelloworld.Leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> curr = new ArrayList<>();

        DFSFindSubset(nums,curr,result,0);

        return result;
    }

    private void DFSFindSubset(int[] nums, List<Integer> curr, List<List<Integer>> result, int currIndex){
        result.add(new ArrayList<>(curr));
        for(int i=currIndex;i<nums.length;i++){
            if(!curr.contains(nums[i])) {
                curr.add(nums[i]);
                DFSFindSubset(nums, curr, result, i+1);
                curr.remove(curr.size() - 1);
            }
        }
    }

}
