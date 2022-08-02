package com.ipreptech;

import java.util.Scanner;

public class BinarySearchRecursion {
    public int finding(int val,int low,int high){

        int mid =(low+high)/2;
        if (array[mid]==val){
            return mid;
        } else if (array[mid]>val) {
                return finding(val,low,mid-1);
        } else return finding(val,mid+1,high);

    }
    public void checking(int size,int val){
        int[] array = new int[size];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("enter the values of array");
            int a = s.nextInt();
            array[i] = a;
        }
        int low = 0;
        int high=array.length;

        int a =finding(val,low,high);
        if(a==-1){
            System.out.println("Not available in the array");
        } else System.out.println("Available in the array");
    }
}