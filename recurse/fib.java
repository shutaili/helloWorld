package com.example.neohelloworld.recurse;

import java.util.Arrays;

public class fib {
    public static void main(String[] args){
        fib fib = new fib();
        int n=5;
        int[] mem = new int[n+1];
        int[] array = {2,3,5,7,1,3,4,6,9,1,4,6};
        Arrays.fill(mem,-1);
//        System.out.println(fib.findFib(n));
//        System.out.println(fib.fibDynamic(n, mem));
//        System.out.println(fib.fibBottomUp(n));
        fib.quickSort(array,0,array.length-1);
        for (int num:array) System.out.print(num+ " ");
    }

    private int findFib(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        return findFib(n-1)+findFib(n-2);
    }

    private int fibDynamic(int n, int[] mem){
        if(n==0) return 0;
        if(n==1) return 1;

        int result;
        if(mem[n]!=-1){
            result = mem[n];
        }else{
            result = fibDynamic(n-1,mem) + fibDynamic(n-2,mem);
            mem[n] = result;
        }
        return result;
    }

    private int fibBottomUp(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        int[] mem = new int[n+1];
        mem[0]=0;
        mem[1]=1;

        for(int i=2; i<=n;i++){
            mem[i] = mem[i-1] + mem[i-2];
        }

        return mem[n];
    }

    private void quickSort(int[] array, int start, int end){
        if(start>=end) return;

        int partitionIndex = partition(array, start, end);
        quickSort(array, start, partitionIndex-1);
        quickSort(array, partitionIndex+1, end);
    }

    private int partition(int[] array, int start, int end){
        int partitionIndex =start;
        int pivot = array[end];

        for(int i=start;i<=end;i++){
            if (array[i] > pivot){
                swap(array, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(array, partitionIndex, end);

        return partitionIndex;
    }

    private void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
