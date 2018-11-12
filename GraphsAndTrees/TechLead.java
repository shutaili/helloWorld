package com.example.neohelloworld.GraphsAndTrees;

import java.util.*;

public class TechLead {

    private Hashtable<Integer, Integer> hashtable = new Hashtable<>();

    public static void main(String[] args){

        int[][] array = {
                {2,2,5,5,6,7,4},
                {4,5,5,5,0,7,4},
                {1,0,5,5,6,7,4},
                {0,3,3,5,6,6,4}
        };

        TechLead techLead = new TechLead();

        System.out.println(techLead.findLongestConnectedPath(array));

    }

    public int findLongestConnectedPath(int[][] array){
//        for (int i=0; i<array.length;i++){
//            for (int k=0; k<array[0].length; k++){
//                if(array[i][k]!=-1 && !hashtable.containsKey(array[i][k])){
//                    hashtable.put(array[i][k], breadthFirstSearch(array, i, k));
//                }
//            }
//        }
//        return Collections.max(hashtable.values());

        int maxLength =0 ;
        for (int i=0; i<array.length;i++){
            for (int k=0; k<array[0].length; k++){
                if(array[i][k]!=-1){
                    maxLength = Math.max(maxLength, breadthFirstSearch(array, i, k));
                }
            }
        }
        return maxLength;
    }

    private int depthFirstSearch(int[][] array, int row, int col){

//        array[][]

        for (int r=0; r<array.length;r++){
            for(int c=0; c<array[0].length; c++){

            }
        }

        return 0;
    }

    private int breadthFirstSearch(int[][] array, int row, int col){
        int ret =0;
        Queue<LocalNode> queue = new LinkedList<LocalNode>();

        queue.add(new LocalNode(row,col));

        LocalNode node;

        int tempArray[][] = array;
        int value = array[row][col];

        while(!queue.isEmpty()){
            node = queue.remove();
            if(value == array[node.x][node.y]){
                ret ++;
            }
            array[node.x][node.y] = -1;

            queue.addAll(getNeighbors(array, node, value));
        }

        return ret;
    }

    private List<LocalNode> getAdjNodes(LocalNode node){
        return null;
    }

    private static List<LocalNode> getNeighbors(int[][] matrix, LocalNode node, int value) {
        List<LocalNode> neighbors = new ArrayList<LocalNode>();

        if(isValidPoint(matrix, node.x - 1, node.y, value)) {
            neighbors.add(new LocalNode(node.x - 1, node.y));
        }

        if(isValidPoint(matrix, node.x + 1, node.y, value)) {
            neighbors.add(new LocalNode(node.x + 1, node.y));
        }

        if(isValidPoint(matrix, node.x, node.y - 1, value)) {
            neighbors.add(new LocalNode(node.x, node.y - 1));
        }

        if(isValidPoint(matrix, node.x, node.y + 1, value)) {
            neighbors.add(new LocalNode(node.x, node.y + 1));
        }

        return neighbors;
    }

    private static boolean isValidPoint(int[][] matrix, int x, int y, int value) {
        return !(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length) && (matrix[x][y] != -1) && (matrix[x][y] == value);
    }

}

class LocalNode{
    public int x;
    public int y;

    LocalNode(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}