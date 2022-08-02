package com.ipreptech;

import java.util.Scanner;

public class ArraySelectionSortReverse {
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
            int maxindex =i;
            for (int j=i+1;j<n;j++) {
                if(arr[maxindex]<arr[j]) {
                    maxindex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[maxindex];
            arr[maxindex]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

}
