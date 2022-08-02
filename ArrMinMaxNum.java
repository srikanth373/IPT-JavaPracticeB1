package com.ipreptech;



import java.util.Scanner;

public class ArrMinMaxNum {
    public int[] read(int n){
        int[] sri=new int[n];
        Scanner s = new Scanner(System.in);
        for (int i=0;i<n;i++){
            System.out.println("enter the values of an array");
            int a=s.nextInt();
            sri[i]=a;
        }
        for (int i=0;i<n;i++){
            System.out.print(sri[i]+" ");
        }
       System.out.println();



        int small=sri[0];
        int large=0;
        for (int i=0;i<sri.length;i++){
            if (sri[i] < small) {
                    small = sri[i];
            }
            if(sri[i]>large){
                large=sri[i];
            }

        }
        System.out.println("smallest number is "+ small);
        System.out.println("largest number is "+ large);
        return sri;
    }

}

/***
 {8,5,45,56,88,75,98,7,10}
5<8     5>8
5       8
45<5    45
56<5
88<5
75<5
98<5



***/
