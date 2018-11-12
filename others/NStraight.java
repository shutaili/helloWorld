package com.example.neohelloworld;

public class NStraight {

    public static void main(String[] args){
//        int[] array = {1,2,3,4,8,6};
//        int[] wrongArray = {1,3,2};
//
//        System.out.println(isNStraight(array, 3));
//        System.out.println(isNStraight(wrongArray,3));

        NStraight nStraight = new NStraight();
        Integer i=9;
        int[] array = {0,0,0,0};
        NStraight.anotherTest(array);
        System.out.println(array[0]);

    }

    private void test(Integer i){
        i=5;
    }

    private static void anotherTest(int[] array){
        array[0]=1;
    }

    public static boolean isNStraight(int[] array, int n){
        if(array.length%n!=0) return false;
        for(int i=0; i< array.length;i+=3){
            if(array[i+1] != (array[i]+array[i+2])/2){
                return false;
            }
        }

        return true;
    }

}
