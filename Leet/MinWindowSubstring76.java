package com.example.neohelloworld.Leet;

import java.util.HashMap;
import java.util.Map;

public class MinWindowSubstring76 {

//    Input: S = "ADOBECODEBANC", T = "ABC"
//    Output: "BANC"
    public static void main(String[] args) {
        MinWindowSubstring76 minWindowSubstring76 = new MinWindowSubstring76();

        System.out.println(minWindowSubstring76.minWindow("ADOBECODEBANC","ABC"));
    }

//     public String minWindow(String s, String t) {
//         if(t.length()>s.length() || t.isEmpty() || s.isEmpty()) return "";

//         int start =0;
//         int leftResult=0;
//         int rightResult=Integer.MAX_VALUE;

//         HashMap<Character, Integer> map = new HashMap<>();
//         int length=t.length();
//         int currentLength=0;

//         for(char c:t.toCharArray()){
//             map.put(c, map.getOrDefault(c,0)+1);
//         }
//         while(!map.containsKey(s.charAt(start))){
//             start++;
//             if(start>=s.length()) return "";
//         }

//         int left=start;
//         int right=start;

//         while(right<s.length()){

//             if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))!=0){
//                 currentLength++;
//                 map.put(s.charAt(right), map.get(s.charAt(right))-1);
//             } else if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right))==0 && length!=currentLength){
//                 while(s.charAt(left)!=s.charAt(right)){
//                     if(map.containsKey(s.charAt(left))){
//                         map.put(s.charAt(left),map.get(s.charAt(left))+1);
//                         currentLength--;
//                     }
//                 }
//                 left++;
//                 while(map.getOrDefault(s.charAt(left),1)!=0){
//                     left++;
//                 }
//             }
//             if(length==currentLength){
//                 if (right-left<rightResult-leftResult){
//                     rightResult=right;
//                     leftResult=left;
//                 }
//                 map.put(s.charAt(left),map.get(s.charAt(left))+1);
//                 currentLength--;
//                 while(map.getOrDefault(s.charAt(left),1)!=0){
//                     left++;
//                     if(left>=s.length()) break;
//                 }
//             }
//             right++;
//         }

//         return s.substring(leftResult,rightResult+1);
//     }

    // Only add counter if map value >0
    public String minWindow(String s, String t) {
        if(t.length()> s.length()) return "";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int counter = map.size();

        int begin = 0, end = 0;
        int head = 0;
        int len = Integer.MAX_VALUE;

        while(end < s.length()){
            char c = s.charAt(end);
            if( map.containsKey(c) ){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0) counter--;
            }
            end++;

            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0){
                        counter++;
                    }
                }
                if(end-begin < len){
                    len = end - begin;
                    head = begin;
                }
                begin++;
            }

        }
        if(len == Integer.MAX_VALUE) return "";
        return s.substring(head, head+len);
    }


}
