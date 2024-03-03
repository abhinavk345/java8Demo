package com.abhi.recursion1;

public class BinarySearchFindElement {

    public static void main(String[] args) {

        int [] arr={1,5,13,40,45,67,78,89,90,900};
        int key=45;

        boolean present =binarySearch(arr,0,arr.length-1,key);
        if(present)
        System.out.println("Element is present");
        else
        System.out.println("Element is not present");

    }

    private static boolean binarySearch(int[] arr, int start,int end, int key) {

        if(start>end) return false;
        int mid=(end-start)/2;
        if(arr[mid]==key) return true;

        if(mid>key)
            return binarySearch(arr,mid+1,end,key);
        else return binarySearch(arr,start,mid-1,key);

    }
}


