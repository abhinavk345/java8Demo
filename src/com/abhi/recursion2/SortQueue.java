package com.abhi.recursion2;

import com.abhi.utility.Utility;

/*
Input: queue = {10, 7, 16, 9, 20, 5}
Output: 5 7 9 10 16 20
Input: queue = {0, -2, -1, 2, 3, 1}
Output: -2 -1 0 1 2 3
* */
public class SortQueue {

    public static void main(String[] args) {
        int  input[]={13,5};
        sortQueue(input,input.length);
        for(int a:input)
            System.out.print(a+" ");
    }

    private static void sortQueue(int input[],int length) {

        if(length==0){
            return;
        }
          if(input[length-1]<input[length-2])  {
              Utility.swap(input[length-1],input[length-2]);
              sortQueue(input,length-1);
          }
    }
}
