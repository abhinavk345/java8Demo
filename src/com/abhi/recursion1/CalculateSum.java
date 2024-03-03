package com.abhi.recursion1;

public class CalculateSum {

    public static void main(String[] args) {

        int [] arr={1,2,3,40};
        int sum=findSum(arr,arr.length);
        System.out.println("Sum :  "+sum);

    }

    private static int findSum(int[] arr,int size) {
    if(size==0) return 0;
    if(size==1) return arr[0];
     return arr[size-1]+findSum(arr,size-1);

    }
}


