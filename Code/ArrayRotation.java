package com.Najmudin;

public class ArrayRotation {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int d=2;
        int n=arr.length;
        for( int i=0; i<d;i++){
            rotateArray(arr,n);
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static void rotateArray(int arr[],int n){
        int temp=arr[0];
        for(int i=0; i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    //for clockwise.
//    static void rotateArray(int arr[],int n){
//        int temp=arr[n-1];
//        for(int i=n-1; i>0;i--){
//            arr[i]=arr[i-1];
//        }
//        arr[0]=temp;
//    }
}
