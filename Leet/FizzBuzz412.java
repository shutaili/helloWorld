package com.example.neohelloworld.Leet;


//        Write a program that outputs the string representation of numbers from 1 to n.
//
//        But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
import java.util.LinkedList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        if(n <1) return new LinkedList<>();

        List<String> result = new LinkedList<>();
        for(int number=n;number>0;number--){
            if(number%3==0 && number%5==0){
                result.add("FizzBuzz");
            }
            else if(number%3==0){
                result.add("Fizz");
            }
            else if(number%5==0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(number));
            }
        }

        return result;
    }
}
