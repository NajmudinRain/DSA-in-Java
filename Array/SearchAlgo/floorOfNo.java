package com.Najmudin;

public class floorOfNo {
    public static void main(String[]args){
        int[]arr= {2,4,6,7,8,9,11,22,33,44,55,88,102,105,108};
        int target=89;
        //floor no is the largest no samller or equal to target.
        System.out.println(floorOfNo(arr,target));

    }
    static int floorOfNo(int []arr, int target){
        if(target<arr[0])return -1; //when target is less than the smallest no in arr
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return end; //returning the index instead of element.
    }
}
