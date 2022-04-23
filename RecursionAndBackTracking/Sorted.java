package com.Najmudin;

public class Sorted {
    public static void main(String[] args) {
        int arr[]={1,2,9,4,5,6,7,8};
        boolean ans=isSorted(arr,0);
        System.out.println(ans);

    }
    //all the references of array in the different function will be pointing to the same object of array. so if we modified
    //array in any of the function call . it will modified the array in all function.
    static boolean isSorted(int arr[],int index){
        if(index==arr.length-1)return true;
        return (arr[index]<arr[index+1])&&isSorted(arr,index+1);
    }
}
