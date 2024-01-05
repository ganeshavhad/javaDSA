package com.numberAlgo;

public class LargestSmallest {
    public static void main(String[] args) {
        int num = 65498;
        int small=9;
        int large=0;
        while(num>9){
            int r = num%10;
             small = Math.min(r,small);
             large= Math.max(r,large);
             num = num/10;
        }
        System.out.println(small + " ==" + large);
    }
}
