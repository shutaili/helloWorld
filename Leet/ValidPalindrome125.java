package com.example.neohelloworld.Leet;

public class ValidPalindrome125 {

    public static void main(String[] args) {
        ValidPalindrome125 validPalindrome125 = new ValidPalindrome125();
        System.out.println(validPalindrome125.isPalindrome("a.b,."));
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty() || s.length()==1) return true;
        return helper(s, 0, s.length() - 1);
    }

    private boolean helper(String s, int left, int right) {
        if (left+1 >= right) {
            return !isOutRange(s,left) && !isOutRange(s,right);
        }
        if (!isOutRange(s, left) && !isOutRange(s, right) && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        if(left+1<right-1) {
            left += 1;
            right -= 1;
            while (isOutRange(s, left) && left < right) {
                left += 1;
            }
            while (isOutRange(s, right) && right > left) {
                right -= 1;
            }
            return helper(s, left, right);
        } else if(!isOutRange(s,left+1) && !isOutRange(s,right-1)){
            return true;
        } else {
            return false;
        }
    }

    private boolean isOutRange(String s, int index) {
        return !Character.isLetter(s.charAt(index)) && !Character.isDigit(s.charAt(index));
    }

}