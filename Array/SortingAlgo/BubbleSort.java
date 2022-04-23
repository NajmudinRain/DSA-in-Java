package com.Najmudin;
//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order
//in each iteration we are comparing the adjacent element and swapping them such that the largest element goes to end.and the
//second largest elem to secnd large index.

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
	// write your code here
//        int arr[]={1,3,5,4,2};
        int []arr={1,2,3,4,5};
        bubbleSort(arr);
            System.out.print(Arrays.toString(arr));
        }


static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0; i<arr.length;i++){
            swapped=false;
            //for each step,max item will come at the last respective index.
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item.
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }}
            if(!swapped){ //if at any steps arrays value are not swapped it means remaining part is sorted.
                break;}
        }}
}
