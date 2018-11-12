package com.example.neohelloworld;

import java.util.*;

public class Genericc {

    public static void main(String[] args) {

        // Creating a sample array and populating it
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            arrayList.add(i);
        }

        // Calling the method with a custom comparator and printing the return value
        System.out.println("MaxValue = " + getMax(arrayList, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }));
    }

    static <T> T getMax(Collection ts, Comparator<? super T> comparator){
        T max = null;

        Iterator<? super T> itr = ts.iterator();
        while(itr.hasNext()){
            T val = (T) itr.next();
            if(max == null || comparator.compare(val, max) > 0){
                max = val;
            }
        }
        return max;
    }

    // A sample class T
    private static class T {
        int val;
        public T (int val){
            this.val = val;
        }
    }
}
