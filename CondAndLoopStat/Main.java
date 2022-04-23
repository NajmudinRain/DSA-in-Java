package com.Najmudin;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n)
        {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
     System.out.println(b);
    }
}
