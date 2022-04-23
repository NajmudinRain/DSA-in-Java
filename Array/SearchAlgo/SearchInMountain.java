package com.Najmudin;
//pseudocode
//find peak element
//binary search in asc array
//binary search in desc arr
public class SearchInMountain {
    public static void main(String[]args){
        int[]arr={0,1,3,4,8,9,10,11,12,5,4,3,2,1,0};
        int target=2;

//       int result=Math.min(orderAgnosticBS(arr,target,0,peak),orderAgnosticBS(arr,target,peak,arr.length-1));
       System.out.println(findInMountainArray(arr,target));


    }
    static int findInMountainArray(int arr[],int target) {
        int peak=peakIndexInMountainArray(arr);
        int firsthand=orderAgnosticBS(arr,target,0,peak);
        if(firsthand!=-1)return firsthand;
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }

    static  int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in descending part of an array.
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    static int orderAgnosticBS(int []arr, int target,int start,int end){
//        int start=0;
//        int end=arr.length-1;

        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
//            int mid= start+end/2;
            int mid=start+ (end-start)/2;
            if(target==arr[mid])return  mid;
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            } else {

                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}
