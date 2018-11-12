package com.example.neohelloworld.Leet;

import java.util.HashMap;

public class LongestSubstringWithoutReplacingChars3 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1) return 1;

        int left=0;
        int right=0;
        int length=0;
        int currentLength=0;

        HashMap<Character,Integer> letters = new HashMap<>();
        char[] string = s.toCharArray();

        while(right<string.length && !s.isEmpty()){

            if(letters.getOrDefault(string[right],0)==0){
                letters.put(string[right],letters.getOrDefault(string[right]+1,1));
                currentLength++;
            } else if(letters.get(string[right])!=0){
                length=currentLength;
                letters.put(string[right],letters.get(string[right])+1);
                do{
                    letters.put(string[left],letters.get(string[left])-1);
                    left++;
                    currentLength--;
                }while(string[left]!=string[right]);
                letters.put(string[left],letters.get(string[left])-1);
                left++;
                currentLength--;
            }
            right++;
            length=Math.max(length,currentLength);
        }

        return currentLength;
    }
}
