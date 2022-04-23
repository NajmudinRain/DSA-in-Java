package com.Najmudin;

public class SumOfDigit {
    public  static void main(String[]args){
     int digits=34598;
     System.out.println(sumOfDigits(digits));
    }
    static int sumOfDigits(int n){
        if(n==0)return 0;
        return sumOfDigits(n/10)+n%10;
    }
}
