package com.example.neohelloworld.Leet;

public class EliminationGame390 {
    public int lastRemaining(int n) {
        if(n%4==0){
            if(n%2==0){
                return n-2;
            }else{
                return n-1;
            }
        }else{
            if(n%2==0){
                return n;
            }else{
                return n-1;
            }
        }
    }
}
