package com.example.neohelloworld.Leet;

public class ReverseString344 {
//    public String reverseString(String s) {
//        if(s.isEmpty()) return null;
//
//        char[] reverse = new char[s.length()];
//        reverse(s,reverse,s.length()-1);
//        return new String(reverse);
//    }
//
//    private void reverse(String s, char[] reverse, int index){
//
//        if(index<0) return;
//
//        reverse[reverse.length-1-index] = s.charAt(index);
//
//        reverse(s,reverse,index-1);
//    }

    public String reverseString(String s) {
        if(s.isEmpty()) return null;
        char[] reverse = new char[s.length()];
        for(int i=0;i<reverse.length;i++){
            reverse[i]=s.charAt(s.length()-i-1);
        }
        return new String(reverse);
    }
}
