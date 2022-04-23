package com.Najmudin;

import com.sun.tools.jconsole.JConsoleContext;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={3,6,5,7,9,10,12};
        divide(arr,0,arr.length-1);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
//    static void sort(int []arr, int start, int end){
//         divide(arr,start,end);
//    }
    static void divide(int arr[], int start, int end){
         if(start>=end)return;
        int mid=start+(end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);

    }
    static  void conquer(int arr[], int start, int mid, int end){
        int merged[]=new int[end-start+1];
        int id1=start;
        int id2=mid+1;
        int x=0;
       while(id1<=mid&&id2<=end){
           if(arr[id1]<=arr[id2]){
               merged[x++]=arr[id1++];
           }else{
               merged[x++]=arr[id2++];
           }
       }
       while(id1<=mid){
           merged[x++]=arr[id1++];
       }
       while(id2<=end){
           merged[x++]=arr[id2++];
       }
       for(int i=0,j=0; i<merged.length;i++,j++){
           arr[i]=arr[j];
       }

    }
}
