package com.Najmudin;
//The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
// 1) The subarray which is already sorted.
// 2) Remaining subarray which is unsorted.
//In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[]args){
        int []arr={2,3,4,1,5};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selectSort(int arr[]) {

        for(int i=0; i<arr.length-1;i++) {
           int smallest=arr[i];
           //find the smallest in the remaining array and put it into its place.
           for(int j=i+1;j<arr.length;j++){
               if(smallest>arr[j]){
                   int temp=smallest;
                   smallest=arr[j];
                   arr[j]=temp;
               }
           }
           arr[i]=smallest;
        }
    }}
