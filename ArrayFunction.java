package com.ipreptech;

import java.util.Scanner;

public class ArrayFunction {
    public int[] create(int n) {
        int[] arr = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the values of array");
            int a = s.nextInt();
            arr[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }
}
