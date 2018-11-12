package com.example.neohelloworld.Leet;

public class FloodFill733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        return dfs(image, sr,sc,newColor, image[sr][sc]);
    }

    private int[][] dfs(int[][] image, int row, int col, int newColor, int color){

        if(image[row][col]==color){
            image[row][col]= newColor;
        }

        if(!isNeighborValid(row-1,col,image,color)&&!isNeighborValid(row,col-1,image,color)&&!isNeighborValid(row+1,col,image,color)&&!isNeighborValid(row,col+1,image,color)){
            return image;
        }

        if(isNeighborValid(row-1,col,image,color)){
            image = dfs(image, row-1,col, newColor,color);
        }

        if(isNeighborValid(row,col-1,image,color)){
            image = dfs(image, row,col-1, newColor,color);
        }

        if(isNeighborValid(row+1,col,image,color)){
            image = dfs(image, row+1,col, newColor,color);
        }

        if(isNeighborValid(row,col + 1,image,color)){
            image = dfs(image, row,col+1, newColor,color);
        }

        return image;
    }

    private boolean isNeighborValid(int row, int col, int[][] image, int color){
        return (row>=0 && row<image.length && col>=0 && col <=image[0].length) && image[row][col]==color;
    }

}
