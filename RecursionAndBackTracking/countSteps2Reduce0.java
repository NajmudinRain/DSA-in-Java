package com.Najmudin;

class countSteps2Reduce0 {
    public static  void main(String[]args){
      int ans=  numberOfSteps(14);
      System.out.print(ans);
    }
    // public int numberOfSteps(int num) {
    //     return countfun(num,0);
    // }
    // int countfun(int num, int count){
    //     if(num==0)return count;
    //     if(count%2==0){
    //        return countfun(num/2,++count);
    //     }
    //     else{
    //         return countfun(num-1,++count);
    //     }
    // }
   static int numberOfSteps(int num) {
        int count=0;
        while(num>0){
            if(num%2==0){
                num=num/2;
                count++;
            }else{
                num=num-1;
                count++;
            }
        }
        return count;
    }
}