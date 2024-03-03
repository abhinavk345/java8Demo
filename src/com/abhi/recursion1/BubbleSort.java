package com.abhi.recursion1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int []myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        System.out.println(Arrays.toString(bubbleSort(myArray)));


    }

    public static int[] bubbleSort(int array []){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if(array[j]>array[j+1]){
                    //swap
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;

                }
            }
        }
        return array;
    }
}
