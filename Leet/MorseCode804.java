package com.example.neohelloworld.Leet;

import java.util.HashSet;

public class MorseCode804 {

    public int uniqueMorseRepresentations(String[] words) {
        HashSet<String> transformations = new HashSet<>();
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder transformation;
        for(String word: words){
             transformation = new StringBuilder();
            for(int i=0;i<word.length();i++){
                if((word.charAt(i)-'a') < morseCodes.length) {transformation.append(morseCodes[word.charAt(i)-'a']);}
            }
            transformations.add(transformation.toString());
        }

        return transformations.size();

    }
}
