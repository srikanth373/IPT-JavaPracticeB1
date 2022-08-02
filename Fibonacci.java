package com.ipreptech;

public class Fibonacci {
    public void display(int n){
        int s1=0;
        int s2=1;
        int sum=0;
        System.out.println(s1);
        System.out.println(s2);
        for (int i=0;i<n;i++){
            if (sum<=n){
               sum=s1+s2;
                System.out.println(sum);
                s1=s2;
                s2=sum;
            }
        }
    }
}