package com.example.neohelloworld.Leet;

import java.util.LinkedList;
import java.util.List;

public class LetterCasePermutation784 {

    public List<String> letterCasePermutation(String S) {
        List<String> ret = new LinkedList<>();

        dfs(S.toCharArray(), 0, ret);

        return ret;
    }

    private void dfs(char[] s, int index, List<String> ret){

        if(index==s.length){
            ret.add(String.valueOf(s));
            return;
        }

        if(Character.isLetter(s[index])){
            s[index]=flipCase(s[index]);
            dfs(s, index+1,ret);
            s[index]=flipCase(s[index]);
        }

        dfs(s,index+1,ret);

    }

    private char flipCase(char c){
        if(Character.isLowerCase(c)){
            return Character.toUpperCase(c);
        }

        return Character.toLowerCase(c);
    }

}
