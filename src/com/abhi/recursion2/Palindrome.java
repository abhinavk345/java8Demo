package com.abhi.recursion2;

public class Palindrome {

    public static void main(String[] args) {
        int number=123321;
        Integer n=123;
      //  n.resolveConstantDesc()
        String value=String.valueOf(number);
        if(isPalindrome(value,0,value.length()-1))
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
    }
    public static boolean isPalindrome(String value,int start,int end){
        if(start>=end){
            return true;
        }

            if(value.charAt(start)==value.charAt(end))
                return isPalindrome(value,start+1,end-1);
            else return false;
    }
}
