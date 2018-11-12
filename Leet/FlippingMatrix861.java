package com.example.neohelloworld.Leet;

public class FlippingMatrix861 {

    public static void main(String[] args) {
        FlippingMatrix861 flippingMatrix861 = new FlippingMatrix861();

//        int[][] array = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int[][] array = {{0,1},{1,1}};

        System.out.println(flippingMatrix861.matrixScore(array));
    }

    public int matrixScore(int[][] A) {
        int zeroCount;
        int oneCount;
        flipFirstCol(A);
        for(int col=1;col<A[0].length;col++){
            zeroCount=0;
            oneCount=0;
            for(int row=0; row<A.length; row++){
                if(A[row][col]==0){
                    zeroCount++;
                }else{
                    oneCount++;
                }
            }
            if(zeroCount > oneCount){
                flipCol(A, col);
            }
        }

        return calculateSum(A);
    }

    public void flipFirstCol(int[][] A){
        for(int row=0; row<A.length; row++){
            if(A[row][0] ==0){
                for(int col=0;col<A[0].length;col++){
                    A[row][col] = A[row][col] == 1 ? 0:1;
                }
            }
        }
    }

    public void flipCol(int[][] A, int col){
        for(int row=0;row<A.length;row++){
            A[row][col] = A[row][col] == 1 ? 0:1;
        }
    }

    public int calculateSum(int[][] A){
        int rowSum;
        int totalSum=0;
        for(int row=0;row<A.length;row++){
            rowSum=0;
            for(int col=0;col<A[0].length;col++){
                rowSum += (A[row][col] * (int) Math.pow(2.0, A[0].length-1-col));
            }
            System.out.println(rowSum);
            totalSum+=rowSum;
        }

        return totalSum;
    }

    public int powerOf(int base, int power){
        int ret=1;
        for(int i=0;i<=power;i++){
            ret=ret*base;
        }
        return base;
    }

//    class Solution {
//        public int matrixScore(int[][] A) {
//            int M = A.length, N = A[0].length, res = (1 << (N - 1)) * M;
//            for (int j = 1; j < N; j++) {
//                int cur = 0;
//                for (int i = 0; i < M; i++) cur += A[i][j] == A[i][0] ? 1:0;
//                res += Math.max(cur, M - cur) * (1 << (N - j - 1));
//            }
//            return res;
//        }
//    }

}
