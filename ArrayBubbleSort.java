package com.ipreptech;

import java.util.Scanner;

public class ArrayBubbleSort {
    public int[] display(int n){
        int[] a1 = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the values of array");
            int a = s.nextInt();
            a1[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a1[i]+" ");
        }
        System.out.println();

        int temp=0;

        for (int i=0;i<a1.length;i++){
            for (int j=0;j< a1.length-1;j++){
               if(a1[j]>a1[j+1]){
                   temp=a1[j];
                   a1[j]=a1[j+1];
                   a1[j+1]=temp;
               }
            }
        }
        for (int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");
        }
        return a1;
    }
}
