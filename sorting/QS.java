package com.example.neohelloworld.sorting;

public class QS {

    public static void main(String[] args) {
        QS qs = new QS();
        int[] nums = {2,4,0,-10,-5,67,1,2,5,7,4,2,2,-291,5,7,6};

        qs.qs(nums,0,nums.length-1);

        for(int num:nums){
            System.out.print(num + " ");
        }
    }

    private void qs(int[] array, int start, int end){
        if(start>=end){
            return;
        }
        int index = partition(array,start,end);
        qs(array, start, index-1);
        qs(array, index+1, end);
    }

    private int partition(int[] array, int start, int end){
        int partitionIndex=start;
        int pivot = array[end];

        for(int i=start;i<=end;i++){
            if(array[i]<pivot){
                swap(array, partitionIndex, i);
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
