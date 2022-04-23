package com.Najmudin;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={2,4,6,7,8,9,11,22,33,44,55,88,102,105,108};
//        int[] arr={9,8,7,6,5,4,3,2,1};
        int target=7;
        int ans= orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int []arr, int target){
        int start=0;
        int end=arr.length-1;

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
