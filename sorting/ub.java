package com.example.neohelloworld.sorting;

import java.util.HashMap;
import java.util.Map;

public class ub {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String [][] array = {
                {"A",null,null},{null,null,null},{null,"C","B"}
        };

        ub ub = new ub();

        ub.fillArrayBasedOnMD(array);

        for(int row=0; row<array.length;row++){
            System.out.println();
            for(int col=0; col<array[0].length;col++){
                System.out.print(array[row][col] +" ");
            }
        }

    }

    public void fillArrayBasedOnMD(String[][] array){
        HashMap<String,String> map = new HashMap<>();

        for(int row=0; row<array.length;row++){
            for(int col=0; col<array[0].length;col++){
                if(array[row][col] !=null){
                    String index = row + "," + col;
                    map.put(index, array[row][col]);
                }
            }
        }

        for(int row=0; row<array.length;row++){
            for(int col=0; col<array[0].length;col++){
                if(array[row][col] ==null){
                    String closetPointKey = findThePointWithMinMD(row, col,map);
                    array[row][col] = map.get(closetPointKey);
                }
            }
        }
    }

    private String findThePointWithMinMD(int row, int col, Map<String,String> map){
        String ret = null;
        int dist = Integer.MAX_VALUE;

        for(String key: map.keySet()){
            Integer x2 = Integer.parseInt(key.split(",")[0]);
            Integer y2 = Integer.parseInt(key.split(",")[1]);
            int tempDist = manhattenDistance(row, x2, col, y2);
            if(tempDist< dist){
                dist=tempDist;
                ret=key;
            }
        }

        return ret;

    }

    private int manhattenDistance(int x1, int x2, int y1, int y2){
        return Math.abs(x2-x1) + Math.abs(y2-y1);
    }

}
