package com.example.neohelloworld.Leet;

public class ValidPalindromeII680 {

    public static void main(String[] args) {
        ValidPalindromeII680 validPalindromeII680 = new ValidPalindromeII680();

        System.out.println(validPalindromeII680.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    public boolean validPalindrome(String s){
        if(s.isEmpty() || s.length()==1) return true;

        int rightPointer = s.length();

        for(int i=0;i<s.length();i++){
            rightPointer-=1;
            System.out.println(s.charAt(i) + " " + s.charAt(rightPointer));
            if(i>=rightPointer) return true;

            if(s.charAt(i)!=s.charAt(rightPointer) && (isValidPali(s, i+1, rightPointer) || isValidPali(s, i, rightPointer-1))){
                return true;
            } else if(s.charAt(i)!=s.charAt(rightPointer)){
                return false;
            }
        }

        return true;
    }

    private boolean isValidPali(String s, int left, int right){
        for(int i=left;i<right;i++){
            if(s.charAt(i)!=s.charAt(right)) return false;
            right-=1;
        }
        return true;
    }

}
