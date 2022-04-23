package com.Najmudin;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,9,8,5,4,0,19,12,14,19,21,18,16};
//        int arr[]={5,4,3,2,1,0,9};
//        int[]result=mergeSort(arr);
//        System.out.println(Arrays.toString(result));
        mergeInPlace(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    //we use divide and conquer approach
    static int[] mergeSort(int arr[]){
    if(arr.length==1)return arr;
    int mid=arr.length/2;
    //this is divide
    int []left=mergeSort(Arrays.copyOfRange(arr,0,mid)); //mid is exclusive in this function.
    int[]right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

    return conquer(left,right);

    }
    //this is conquer. here weh have to merge to two sorted array.
    static int[] conquer(int[]first,int[]second){
      int[] mix=new int[first.length+second.length];  //creating another array of length equals to sum of two arrays that we want to merge

      int i=0; //for pointing the start of first array.
      int j=0; //for pointih the start of second array.
      int k=0; // for pointing the start of miz array.
      while(i<first.length&&j<second.length){
          if(first[i]<second[j]){
              mix[k]=first[i];
              i++;
          }else{
              mix[k]=second[j];
              j++;
          }
          k++;
      }
        // it may be possible that one of the arrays is not complete
   // copy the remaining elements
      while(i<first.length){
          mix[k]=first[i];
          i++;
          k++;
      }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

    return mix;
    }
    static void mergeInPlace(int arr[],int si, int ei){
        if(si>=ei)return;

        int mid=si+(ei-si)/2;
         mergeInPlace(arr,si,mid);
         mergeInPlace(arr,mid+1,ei);

        conquer(arr,si,mid,ei);

    }
    static  void conquer(int[]arr,int si, int mid, int ei){
        int[]mix= new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid&&j<=ei){
            if(arr[i]<=arr[j]){
                mix[k]=arr[i];
                k++;
                i++;
            }else{
                mix[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<=ei){
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int l=0;l<mix.length;l++){
            arr[si+l]=mix[l];
        }
    }


}
