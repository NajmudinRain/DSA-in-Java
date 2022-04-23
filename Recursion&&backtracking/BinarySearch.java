package com.Najmudin;

public class BinarySearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9};
        int target=4;
        int start=0;
        int end=arr.length-1;
        int ans=bs(arr,start,end,target);
 System.out.println(ans);


    }
   static int bs(int[] arr, int s, int e,int target){
        if(s>e)return -1;
        int mid=s+(e-s)/2;
        if(target==arr[mid])return mid;
        if(target<arr[mid]){
            return bs(arr,s,mid-1,target);
        }else {
            return bs(arr,mid+1,e,target);
        }
    }


}
