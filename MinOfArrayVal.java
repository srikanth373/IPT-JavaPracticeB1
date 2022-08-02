package com.ipreptech;

public class MinOfArrayVal {
    public void Value(){
        int[] a1 ={25,52,5,62,35,45,98,4,27,64};
        System.out.println(a1.length);

        int small=0;
        int large=0;
        int temp=a1[0];
        for (int j : a1) {
            if (temp <= j) {
                if (large < j) {
                    large = j;
                }
            } else {
                small = j;
                temp = j;
            }
            System.out.print(small + " ");
            System.out.print(large + " ");
        }
        System.out.println();
        System.out.println("smallest number is "+small);
        System.out.println("largest number is "+large);

    }
}
