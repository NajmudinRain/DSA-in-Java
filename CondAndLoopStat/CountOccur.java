package com.Najmudin;

public class CountOccur {
    public static void main(String[] args) {
         int num= 998887;
         int count=0;
         while(num>0)
         { int rem= num%10;
             if(rem==8) count++;
             num=num/10;

         }
System.out.println(count);

    }
}
