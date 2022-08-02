package com.ipreptech;

import java.util.Scanner;

public class ArraySearch {
    public void findinarray(int n,int f){
        int[] a3 = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the values of array");
            int a = s.nextInt();
            a3[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a3[i]+" ");
        }
        System.out.println();

        boolean exist = false;
        for (int i=0;i<a3.length && !exist;i++){
            if (f == a3[i]) {
                exist = true;
            }
        }
        if(exist){
            System.out.println("The number is present");
        } else {
            System.out.println("The number is not present");
        }
    }
}
