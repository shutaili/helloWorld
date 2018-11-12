package com.example.neohelloworld.Leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> curr = new ArrayList<>();

        findPermutations(nums,curr,result);

        return result;
    }

    private void findPermutations(int[] nums, List<Integer> curr, List<List<Integer>> result){

        if(curr.size()==nums.length){
            result.add(new ArrayList<>(curr));
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (!curr.contains(nums[i])) {
                    curr.add(nums[i]);
                    findPermutations(nums, curr, result);
                    curr.remove(curr.size() - 1);
                }
            }
        }
    }
}