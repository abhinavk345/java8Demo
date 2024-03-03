package com.abhi.recursion1;

public class FindElement {

    public static void main(String[] args) {

        int [] arr={1,50,3,40};
        int key=50;
        boolean present =isPresent(arr,arr.length,key);
        if(present)
        System.out.println("Element is present");
        else
        System.out.println("Element is not present");

    }

    private static boolean isPresent(int[] arr, int length, int key) {

        if(length==0) return  false;
        if(length==1 && key==arr[0]) return true;
        if(key==arr[length-1]) return true;
        else return isPresent(arr,length-1,key);
    }
}


