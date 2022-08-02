package com.ipreptech;

import java.util.Scanner;

public class ArrayOfSum {

    public int sumarray() {
        int sum = 0;
        int n = 5;
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

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    return sum;
    }

}