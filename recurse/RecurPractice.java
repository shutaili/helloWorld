package com.example.neohelloworld.recurse;

public class RecurPractice {

    public static void main(String[] args){
        String helloWorld = "Hi   Wor    l  d   ";
        String palidrome = "a";

        RecurPractice recurPractice = new RecurPractice();
//        recurPractice.printAllChars(helloWorld,0);
        System.out.println(recurPractice.isPalindrome(palidrome,0,palidrome.length()-1));
//        System.out.println(recurPractice.powerOf(5,3));
    }

    public void printAllChars(String input, int index){
        if(index==input.length()-1){
            if(input.charAt(index)!= ' ') System.out.print(input.charAt(index));
        } else{
            if(input.charAt(index)!= ' ') System.out.print(input.charAt(index));
            printAllChars(input, index+1);
        }
    }

    public boolean isPalindrome(String inputString, int start, int end){
        if(start==end || start>end){
            return true;
        }

        if(inputString.charAt(start)!=inputString.charAt(end)){
            return false;
        }

        return isPalindrome(inputString, start+1, end-1);
    }

    public Integer powerOf(Integer a, Integer b){
        if(b==0){
            return 1;
        } else{
            return a*powerOf(a,b-1);
        }
    }

}
