package com.abhi.recursion1;

public class CheckSorted {

    public static void main(String[] args) {

        int [] arr={1,2,3,435,67,89};
        boolean isSorted=isSorted(arr,arr.length);
        if(isSorted) System.out.println("array is sorted");
        else System.out.println("array is not sorted");
    }

    private static boolean isSorted(int[] arr, int length) {
        if(length==1 || length==0) return true;
        if(arr[length-1]<arr[length-2]) return false;
        else {
            return isSorted(arr,length-1);
        }
    }
}


