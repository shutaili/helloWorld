package com.example.neohelloworld.Leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        if(n==0) return result;
        char[] paren = new char[n+n];
        fill(paren);

        findAllValidParen(paren,0,result,new ArrayList<Character>());

        return result;

    }

    private void findAllValidParen(char[] paren, int index, List<String> result, List<Character> curr){
        if(curr.size()==paren.length && isBalanced(curr)){
            StringBuilder b = new StringBuilder();
            curr.forEach(b::append);
            result.add(b.toString());
        } else{
            for(int i=0;i<paren.length;i++){
                if(i!=index){
                    curr.add(paren[i]);
                    findAllValidParen(paren,index+1,result,curr);
                    curr.remove(curr.size()-1);
                }
            }
        }
    }

    private void fill(char[] paren){
        int length=paren.length;
        for(int i=0;i<length;i++){
            if(i<length/2){
                paren[i]='(';
            } else{
                paren[i]=')';
            }
        }
    }

    private void flip(char[] paren, int index){
        paren[index] = paren[index] == ')' ? '(' : ')';
    }

    private boolean isBalanced(List<Character> paren){
        Stack<Character> stack = new Stack<>();
        for(char c: paren){
            if(c=='('){
                stack.push(c);
            }
            if(c==')'){
                if(stack.isEmpty() || stack.pop()!='(') return false;
            }
        }

        return stack.isEmpty();
    }
}
