package com.Najmudin;

public class ProductOfDigit {
    public  static void main(String[]args){
        int digits=1234;
//        System.out.println(productOfDigit(digits));
        concept(5);
    }
    static int productOfDigit(int n){
        if(n%10==n)return n; //if one digit is remaining return itself.
        return productOfDigit(n/10)*(n%10);
    }
    static void concept(int n){
        if(n==0)return;
        System.out.println(n);
//        concept(n--);
        concept(--n);
    }


}
