package com.Najmudin;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        qSort(arr,0,arr.length-1);
        for( int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
    static void qSort(int arr[],int low, int high){
        if(low<high){
            int pivId=partition(arr,low,high);
            qSort(arr,low,pivId-1);
            qSort(arr,pivId+1,high);
        }
//        return;
    }
    static int partition(int[]arr, int low,int high){
        int pivot=arr[high];
        int i=low-1; //taking index for tracking element smaller than pivot so than we can place it before pivot.
        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //putting pivot in its corr position and returning its index.
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
}
