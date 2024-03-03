package com.abhi.recursion1;

public class QuickSortUsingRecursion {

    public static void main(String[] args) {

        int [] arr={1,5,13,40,45,67,78,89,90,900};
        quickSort(arr,0,arr.length-1);

        for (int a :arr) {
            System.out.print(a+" ");
        }
    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start>=end)
            return;
        int partition=getPartition(arr,start,end);
        quickSort(arr,start,partition-1);
        quickSort(arr,partition+1,end);

    }
    private static int getPartition(int[] arr, int start, int end) {
       int pivot=arr[start];
       int count =0;
        for (int i = start+1; i <=end; i++) {
            if(arr[i]< pivot)
              count++;
        }
        int pivotIndex=start+count;
        swap(arr[pivotIndex],arr[start]);

        int i=start,j=end;
        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<= pivot){
                i++;
            }
            while (arr[j]> pivot){
                j--;
            }
            if (i<pivotIndex && j>pivotIndex){
                swap(arr[i++],arr[j--]);
            }
        }
        return pivotIndex;
    }
    private static void swap(int first, int second){
        int temp=first;
        first=second;
        second=temp;
    }
}


