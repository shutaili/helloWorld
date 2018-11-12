package com.example.neohelloworld.Leet;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPossiblePathGraph797 {

    public static void main(String[] args) {
        AllPossiblePathGraph797 allPossiblePathGraph797 = new AllPossiblePathGraph797();

        int[][] array = {{1,2},{3},{3},{}};

        System.out.println(allPossiblePathGraph797.allPathsSourceTarget(array));
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        return findPath(graph,0,graph.length-1);
    }

    public List<List<Integer>> findPath(int[][] graph, int start, int end){
        List<List<Integer>> ret = new LinkedList<>();
        Queue<LinkedList<Integer>> q = new LinkedList<>();
        LinkedList<Integer> startingPath = new LinkedList<>();
        startingPath.add(start);
        q.offer(startingPath);
        int currentNode;
        boolean pathFound = false;
        LinkedList<Integer> currentPath = new LinkedList<>();
        while(!q.isEmpty()){
            currentPath=q.poll();
            currentNode=currentPath.getLast();
            for(int col=0;col<graph[currentNode].length;col++){
                LinkedList<Integer> currentPathToAdd = new LinkedList<>();
                currentPathToAdd.addAll(currentPath);
                currentPathToAdd.addLast(graph[currentNode][col]);
                q.offer(currentPathToAdd);
                if(graph[currentNode][col]==end){
                    ret.add(currentPathToAdd);
                }
            }
        }

        return ret;
    }


//    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
//        List<List<Integer>> allPaths = new LinkedList<>();
//        List<Integer> path = findPath(graph,0,graph.length-1);
//        while(!path.isEmpty()){
//            allPaths.add(path);
//            removePath(graph, path);
//            path = findPath(graph,0,graph.length-1);
//        }
//
//        return allPaths;
//    }
//
//    public List<Integer> findPath(int[][] graph, int start, int end){
//        Queue<LinkedList<Integer>> q = new LinkedList<>();
//        LinkedList<Integer> startingPath = new LinkedList<>();
//        startingPath.add(start);
//        q.offer(startingPath);
//        int currentNode;
//        boolean pathFound = false;
//        LinkedList<Integer> currentPath = new LinkedList<>();
//        while(!q.isEmpty()){
//            currentPath=q.poll();
//            currentNode=currentPath.getLast();
//            for(int col=0;col<graph[currentNode].length;col++){
//                if(graph[currentNode][col]==end){
//                    pathFound = true;
//                    currentPath.add(graph[currentNode][col]);
//                    break;
//                }
//                else if(graph[currentNode][col]!=-1){
//                    LinkedList<Integer> currentPathToAdd = new LinkedList<>();
//                    currentPathToAdd.addAll(currentPath);
//                    currentPathToAdd.addLast(graph[currentNode][col]);
//                    q.offer(currentPathToAdd);
//                }
//            }
//
//            if(pathFound){
//                break;
//            }
//        }
//
//        return pathFound ? currentPath : new LinkedList<Integer>();
//    }
//
//    public void removePath(int[][] graph, List<Integer> path){
//        for(int i=0;i<path.size()-1;i++){
//            graph[path.get(i)][path.get(i+1)] = -1;
//        }
//    }

}
