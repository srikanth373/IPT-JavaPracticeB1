package com.ipreptech;

import java.util.Scanner;

public class InsertionSort {
    public int[] Insertion(int n){
        int[] array= new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the values of array");
            int a = s.nextInt();
            array[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for (int i=1;i<array.length;i++){
            int j=i-1;
            int key=array[i];
            for (;(j>=0 && array[j]>key);--j)
            {
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        return array;
    }
}
