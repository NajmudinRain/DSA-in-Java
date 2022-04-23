package com.Najmudin;

public class Fiboformula {
    public static void main(String[] args) {
//        int n=11;
//        for(int i=0; i<11; i++){
//           System.out.println(fibformula(i));
//        }
        System.out.println(fibformula(1000));
    }
    static  long fibformula(int n){

        return (long) ((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));

    }


}
