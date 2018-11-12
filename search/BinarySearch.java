package com.example.neohelloworld.search;

public class BinarySearch {

    public static void main (String [] args){
        BinarySearch binarySearch = new BinarySearch();

        int[] array = {1,2,3,4,5,6,7,8,10,11};

        System.out.println("Number found at index: " + binarySearch.binarySearch(array, 10));
        System.out.println("Number found at index: " + binarySearch.recursiveBinarySearch(array, 10,0, array.length-1));
    }

    public int binarySearch(int[] array, int number){
        int ret =0;
        int leftIndex = 0;
        int rightIndex = array.length;
        boolean foundNumber = false;

        while(!foundNumber){
            int middleIndex = (leftIndex + rightIndex) / 2;
            if(rightIndex == leftIndex){
                System.out.println(rightIndex);
                return -1;
            }
            if(array[middleIndex] == number){
                foundNumber = true;
                ret = middleIndex;
            } else if(array[middleIndex] > number){
                rightIndex = middleIndex -1;
            } else{
                leftIndex = middleIndex +1;
            }
        }

        return ret;
    }

    public int recursiveBinarySearch(int[] array, int number, int leftIndex, int rightIndex){

        if(leftIndex == rightIndex) {
            return -1;
        }

        int middleIndex = (leftIndex + rightIndex)/2;
        if (array[middleIndex] == number) {
            return middleIndex;
        } else if (array[middleIndex] > number) {
            return recursiveBinarySearch(array, number, leftIndex, middleIndex - 1);
        } else {
            return recursiveBinarySearch(array, number, middleIndex + 1, rightIndex);
        }

    }
}
