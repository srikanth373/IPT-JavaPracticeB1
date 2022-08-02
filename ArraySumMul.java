package com.ipreptech;

public class ArraySumMul {
    public static void sumofarray() {
        int[] a1 = {55, 66, 9, 2, 5,23,35,65,99};
        int sum=0;
        for (int i=0;i<a1.length;i++){
            sum += a1[i];
        }
        System.out.println(sum);
    }

    public static void mulofarray() {
        int[] a1 = {55, 66, 9, 2, 5,23,35,65,99};
        int result=1;
        for (int i=0;i<a1.length;i++){
            result *= a1[i];
        }
        System.out.println(result);
    }

}
