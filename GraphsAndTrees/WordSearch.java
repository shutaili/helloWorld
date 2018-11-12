package com.example.neohelloworld.GraphsAndTrees;

import java.util.*;

public class WordSearch {



    public static void main(String[] args){
        String beginWord = "hit";
               String endWord = "cog";
               String[] wordList = {"hot","dot","dog","lot","log","cog"};

        System.out.println(new WordSearch().bfs(wordList,beginWord,endWord).stepTakenToReach);

    }

    public Word bfs(String[] array, String beginWord, String endWord){


        Word shortestPath= new Word(true,0,"");
        Queue<Word> queue = new LinkedList<Word>();
        LinkedList<String> strings = new LinkedList<>();
        strings.addLast(beginWord);

        queue.add(new Word(true, 1, beginWord));
        Word currentWord;
        while(!queue.isEmpty()){
            currentWord=queue.remove();
            if(currentWord.value.equals(endWord)){
                return currentWord;
            }

            currentWord.isSeen = true;
            queue.addAll(getNeighbors(array, currentWord));
        }

        return shortestPath;
    }

    private List<Word> getNeighbors(String[] array, Word word){
        List<Word> words = new LinkedList<>();
        char[] currentStringChars = word.value.toCharArray();

        for(String w: array){
            int numberOfDiff=0;
            char[] wChar = w.toCharArray();
            for(int i=0; i< wChar.length; i++){
                if(currentStringChars[i]!=wChar[i]) numberOfDiff++;
            }
            if(numberOfDiff==1){
                words.add(new Word(false,word.stepTakenToReach+1, w));
            }
        }

        return words;
    }

}

class Word{
    public boolean isSeen;
    public int stepTakenToReach;
    public String value;

    public Word(boolean isSeen, int stepTakenToReach, String value){
        this.isSeen = isSeen;
        this.stepTakenToReach = stepTakenToReach;
        this.value = value;
    }

}