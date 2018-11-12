package com.example.neohelloworld.GraphsAndTrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyAutoComplete {

    public static void main(String[] args){
        TrieTree dictionary = new TrieTree();
        dictionary.addWord("Hello");
        dictionary.addWord("Hehehehe");
        dictionary.addWord("KJSHDKJSHD");
        dictionary.addWord("Hellllllu");

        MyAutoComplete myAutoComplete = new MyAutoComplete();

        System.out.println(myAutoComplete.autoComplete("He", dictionary));
    }

    public List<String> autoComplete(String word, TrieTree dictionary){
        List<String> ret = new LinkedList<>();

        TrieNode currentNode=dictionary.root;

        for(int i=0; i<word.length();i++){
            if(currentNode.children.containsKey(word.charAt(i))){
                currentNode = currentNode.children.get(word.charAt(i));
            } else{
                return ret;
            }
        }

        findAllResults(currentNode, ret);

        return ret;
    }

    private void findAllResults(TrieNode currentNode, List<String> results){
        if(currentNode.isWord){results.add(currentNode.prefix);}
        for(Character c : currentNode.children.keySet()){
            findAllResults(currentNode.children.get(c),results);
        }
    }

}

class TrieTree{
    public TrieNode root;

    public TrieTree(){
        root = new TrieNode("");
    }

    public void addWord(String word){
        TrieNode r = root;
        for(int i=0;i<word.length();i++){
            if(!r.children.containsKey(word.charAt(i))){
                r.children.put(word.charAt(i), new TrieNode(word.substring(0,i+1)));
            }
            r = r.children.get(word.charAt(i));
        }

        r.isWord = true;
    }
}

class TrieNode{
    public String prefix;
    public HashMap<Character, TrieNode> children;
    boolean isWord;

    public TrieNode(String prefix){
        this.prefix = prefix;
        this.children = new HashMap<Character, TrieNode>();
    }
}