package com.example.neohelloworld.Leet;

import java.util.LinkedList;
import java.util.List;

public class AllAnagramInString438 {
    public static void main(String[] args) {
        AllAnagramInString438 allAnagramInString438 = new AllAnagramInString438();

        System.out.println(allAnagramInString438.findAnagrams("af","be"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        return new LinkedList<>();
    }


//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> ret = new LinkedList<>();
//        int length=p.length();
//        int pSum=0;
//        for(int i=0;i<p.length();i++){
//            pSum+=p.charAt(i);
//        }
//        for(int i=0;i<s.length();i++){
//            if(i+length>s.length()) break;
//            if(isAnagram(s.substring(i,i+length),pSum)) ret.add(i);
//        }
//
//        return ret;
//    }
//
//    private boolean isAnagram(String s, Integer pSum){
//        int sSum=0;
//        for(int i=0;i<s.length();i++){
//            sSum+=s.charAt(i);
//        }
//        return sSum==pSum;
//    }

}
