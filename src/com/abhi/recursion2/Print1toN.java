package com.abhi.recursion2;

/*
Input: N = 5
Output: 1 2 3 4 5
Explanation: We have to print numbers from 1 to 5.

Input: N = 10
Output: 1 2 3 4 5 6 7 8 9 10
Explanation: We have to print numbers from 1 to 10.
* */
public class Print1toN {

    public static void main(String[] args) {
        int  input=10;
        print(input);
    }

    private static void print(int input) {
        if(input<=0)
            return;
        print(input-1);
        System.out.println(input);

    }
}
