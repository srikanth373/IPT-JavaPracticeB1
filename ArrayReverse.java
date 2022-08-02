package com.ipreptech;

import java.util.Scanner;

public class ArrayReverse {
    public int[] anotherarrayuse(int n){
        int[] a2 = new int[n];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("enter the values of array");
            int a = s.nextInt();
            a2[i] = a;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a2[i]+" ");
        }
        System.out.println();


        int size= a2.length;
        int[] a1=new int[size];
        for (int i=0;i<size;i++){
            a1[i]=a2[size-i-1];
        }
        System.out.println("Reversed array is ");
        for (int i=0;i<n;i++){
            System.out.print(a1[i]+" ");
        }
        return a1;
    }
    public int[] samearrayuse(int n){
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

        System.out.println("Reversed array is ");
        int size= a1.length-1;
        for(int i=0;i<=size/2;i++){
            int temp=0;
            temp = a1[i];
            a1[i]=a1[size-i];
            a1[size-i]=temp;
        }

        for (int i=0;i<n;i++){
            System.out.print(a1[i]+" ");
        }
        return a1;
    }
}

