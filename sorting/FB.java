package com.example.neohelloworld.sorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class FB {

    private static Map<String, String> map = new HashMap<>();
    private static Hashtable hashtable = new Hashtable();
    private static HashSet<String> hashSet = new HashSet<String>();

    public static void main(String[] args){
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");
        map.put("f","6");
        map.put("g","7");
        map.put("h","8");
        map.put("i","9");
        map.put("j","10");
        map.put("k","11");
        map.put("l","12");
        for(int i=1; i<27 ;i++){
            hashSet.add(String.valueOf(i));
        }

        FB fb = new FB();
        System.out.println(fb.numWays("253456",0));
    }

    public int numWays(String data, int startingIndex){
        int result =0;
        if(data.isEmpty() || data.charAt(0)== '0'){
            return 0;
        }
        if(hashSet.contains(data.substring(0,startingIndex +1))){
            System.out.println(data.substring(0,startingIndex +1));
            return numWays(data, startingIndex +1) + 1;
        }
//        for(int i=0; i< data.length(); i++){
//            if(hashSet.contains(data.charAt(i))){
//                result ++;
//            }
//        }
        return result;
    }

}
