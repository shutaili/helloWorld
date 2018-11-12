package com.example.neohelloworld.heap;

import java.util.PriorityQueue;

public class MinIntHeap {

    public static void main(String args[]){
        MinIntHeap minIntHeap = new MinIntHeap();
        int[] lol = {1,90,3,16,5,10,7,8,9};
        System.out.println(minIntHeap.findKLargest(lol, 1));
    }

    public int findKLargest(int[] array, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int number : array) {
            q.offer(number);
        }
        while(q.size()>k){
            q.poll();
        }

        return q.peek();
    }


}
