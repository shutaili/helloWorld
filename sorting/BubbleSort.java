package com.example.neohelloworld.sorting;

public class BubbleSort {

    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1,2,6,5,4,3,7,8,3,4,7,8};

        int [] sortedArray = bubbleSort.bubbleSortAsc(array);

        System.out.print("Ascending:");

        for (int number : bubbleSort.bubbleSortAsc(array)) {
            System.out.print(" " + number);
        }

        System.out.println();

        System.out.print("Descending:");

        for (int number : bubbleSort.bubbleSortDes(array)) {
            System.out.print(" " + number);
        }
    }

    public int[] bubbleSortDes(int[] array){
        for (int i=array.length -1 ; i>0 ; i--){
            for(int j=0; j< i; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

    public int[] recursiveBubbleSort(int[] array, int leftCursor, int rightCursor){

        if(leftCursor == rightCursor){
            leftCursor++;
        }

        return null;

    }

    public int[] bubbleSortAsc(int[] array){
        for (int i=array.length -1 ; i>0 ; i--){
            for(int j=0; j< i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }

}
