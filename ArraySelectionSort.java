package com.ipreptech;

import java.util.Scanner;

public class ArraySelectionSort {
    public int[] display(int n){
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


        for (int i=0;i<n-1;i++) {
            int minindex =i;
            for (int j=i+1;j<n;j++) {
                if(arr[minindex]>arr[j]) {
                    minindex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }
}
