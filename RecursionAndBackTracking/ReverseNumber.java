package com.Najmudin;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=123321;

        System.out.println(rev1(num));
        System.out.println(isPalin(123321));

    }
    static int sum = 0;
    static int rev1(int n) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return rev1(n/10);
    }
    static boolean isPalin(int num){
        return num==rev1(num);
    }


}
