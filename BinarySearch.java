package com.ipreptech;

import java.util.Scanner;

public class BinarySearch {
    public int finding(int n,int f){
        int[] array = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the sorting values of an array");
            int a = s.nextInt();
            array[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int low=0;
        int high=n-1;
        for (;low<=high;){
            int mid=(low+high)/2;
            if (array[mid]==f){
                return mid;
            } else if (array[mid]>f) {
                high=mid-1;
            } else low = mid+1;
        }
        return -1;
    }

    public void checking(int n,int f){
        int a =finding(n,f);
        if(a==-1){
            System.out.println("Not available in the array");
        } else System.out.println("Available in the array");
    }

}
