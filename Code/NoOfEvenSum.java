package com.Najmudin;
public class NoOfEvenSum {
    public static  void main(String[]args){
        int []arr={1,-3,0,5,7};
        int k=2;
        System.out.println(NumEvenSum(arr,k));}
    static int NumEvenSum(int arr[], int k){
        int count=0;
        int len=arr.length;
        for(int i=0; i<len-k+1;i++){
            int j=0,sum=0;
            int ind=i;
            while(j<k &&ind<len){
                sum= sum+arr[ind];
                ind++;
                j++;}
            if(sum%2==0)count++;}
        return count;}
}
