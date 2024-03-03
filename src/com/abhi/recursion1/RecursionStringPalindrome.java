package com.abhi.recursion1;

public class RecursionStringPalindrome {

    public static void main(String[] args) {

        String name = "asasa";

        boolean isPalin = checkPalindrome(name, name.length(), 0, name.length() - 1);
        if (isPalin)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");

    }

    private static boolean checkPalindrome(String name, int length, int start, int end) {
        if (length == 0)
            return true;
        if (length == 1)
            return true;

        if(start>end)
            return true;
        if (name.charAt(start) == name.charAt(end)) {
            start++;
            end--;
            return checkPalindrome(name, length, start, end);
        } else {
            return false;
        }

    }
}