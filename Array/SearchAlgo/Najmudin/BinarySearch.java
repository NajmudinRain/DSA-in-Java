package com.Najmudin;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,11,22,33,44,55,88,102,105,108};
        int target=1;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
    static int binarySearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
//            int mid= start+end/2;
            int mid=start+ (end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //ans
                return mid;
            }
        }
        return -1;
    }


}



