package com.Najmudin;

public class CountZeros {
    public static void main(String[] args) {
      int ans=  countfun(30204,0);
      System.out.println(ans);

    }
    //we can also create count variable outside the function
    static int countfun(int num,int count){
        if(num==0)return count;
        if(num%10==0){
            return countfun(num/10,count+1);
        }else {
            return countfun(num/10,count);
        }
    }
}

