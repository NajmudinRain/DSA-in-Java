package com.Najmudin;

class PhoneCharging {
    public static void main(String[] args) {
        System.out.println(chargingSmartPhone(0,5));
    }
    public static int chargingSmartPhone(int initialCharge, int finalCharge){
        int start = initialCharge;
        double count = 0;
        int[] v = {10, 230, 559, 1009, 5000, 10000, 1000000000};
        int[] r = {10, 5, 8, 2, 7, 8, 3};
        for(int i = 0; i < v.length; i++){
            while(start > v[i]){
                i++;
            }
            if(finalCharge < v[i]){
                count += Math.ceil((double)(finalCharge - initialCharge) / (r[i]));
                break;
            }
            else{
                count += Math.ceil((double)(v[i] - initialCharge) / (r[i]));
                initialCharge +=  Math.ceil((double)(v[i] - initialCharge) / (r[i])) * r[i];
            }
            if(initialCharge == v[i]){
                count += 1;
                initialCharge += r[i];
                if(initialCharge > finalCharge){
                    break;
                }
            }
        }
        return (int)count;
    }
}
