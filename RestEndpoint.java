package com.example.neohelloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
class RestEndpoint {

    RestEndpoint() {
    }

    private Integer i = 0;

    int[][] array = {{1,2,3,4},
                    {5,6,7,8}};

    public Integer[][] knapsakcArray = new Integer[4][41];
    @GetMapping(path = "/hello")
    public ResponseEntity getHelloMessage(){
        return ResponseEntity.ok("Hello " + i++);
    }

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";

        char s = S.charAt(1);
        Hashtable<String, String> hashtable = new Hashtable<String, String>();

        Character.toLowerCase('S');

        int value[] = {0,60,100,100};
        int weight[] = {0,10,10,30};
//        int value[] = {10,40,30,50};
//        int weight[] = {5,4,6,3};
        int w = 30;

        RestEndpoint restEndpoint = new RestEndpoint();

//        System.out.println(restEndpoint.knapsack(w, weight, value, 3));
        System.out.println(toLowerCase("HEFHDJKFH5"));
//        System.out.println(restEndpoint.knapsack(value, weight, w));
    }

    public static String toLowerCase(String str) {
        int length = str.length();
        StringBuilder result= new StringBuilder();
        Queue<Character> myQueue = new LinkedList<Character>();
        for(int i=0;i<length;i++){
            if(Character.isUpperCase(str.charAt(i))){
                 myQueue.add(Character.toLowerCase(str.charAt(i)));
            } else{
                myQueue.add(str.charAt(i));
                char[] charArray = str.toCharArray();
                charArray.toString();
            }
        }
        for(int i=0;i<length;i++){
            result.append(myQueue.remove().toString());
        }
        return result.toString();
    }

    private static int numJewelsInStones(String J, String S) {
        int ret=0;
        for(int i =0; i<J.length();i++){
            for(int k=0; k<S.length();k++){
                if(S.charAt(k)==J.charAt(i)){
                    System.out.println(S.charAt(k) + " : "+ J.charAt(i));
                    ret ++;
                }
            }
        }
        return ret;
    }

    private int knapsack(int w, int wt[], int val[], int n){
        int result;
        if (knapsakcArray[n][w]!=null){
            result = knapsakcArray[n][w];
        } else if(n==0||w==0) {
            result = 0;
        } else if(wt[n]>w){
            result = knapsack(w,wt,val,n-1);
        } else{
            result = Math.max(
                    val[n] + knapsack(w-wt[n], wt, val, n-1),
                    knapsack(w,wt,val,n-1)
            );
            knapsakcArray[n][w] = result;
        }
        return result;
    }

    public boolean isValidPalindrome(String s){
        boolean isOneCharRemoved = false;
        int rightPointer = s.length() -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(rightPointer)){
                return false;
            }
            rightPointer-=1;
        }
        return true;
    }

    public int knapsack(int val[], int wt[], int W) {
        int N = wt.length; // Get the total number of items. Could be wt.length or val.length. Doesn't matter
        int[][] V = new int[N + 1][W + 1]; //Create a matrix. Items are in rows and weight at in columns +1 on each side
        //What if the knapsack's capacity is 0 - Set all columns at row 0 to be 0
        for (int col = 0; col <= W; col++) {
            V[0][col] = 0;
        }
        //What if there are no items at home.  Fill the first col with 0
        for (int row = 0; row <= N; row++) {
            V[row][0] = 0;
        }
        for (int item=1;item<=N;item++){
            //Let's fill the values row by row
            for (int weight=1;weight<=W;weight++){
                //Is the current items weight less than or equal to running weight
                if (wt[item-1]<=weight){
                    //Given a weight, check if the value of the current item + value of the item that we could afford with the remaining weight
                    //is greater than the value without the current item itself
                    V[item][weight]=Math.max (val[item-1]+V[item-1][weight-wt[item-1]], V[item-1][weight]);
                }
                else {
                    //If the current item's weight is more than the running weight, just carry forward the value without the current item
                    V[item][weight]=V[item-1][weight];
                }
            }
        }
        //Printing the matrix
        for (int[] rows : V) {
            for (int col : rows) {
                System.out.format("%5d", col);
            }
            System.out.println();
        }
        System.out.println(N);
        System.out.println(W);
        return V[N][W];
    }

    private static Integer getFactorial(Integer input){
        if (input==1)
            return 1;
        else
            return input*getFactorial(input-1);
    }
}
