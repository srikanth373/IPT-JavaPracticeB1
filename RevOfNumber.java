package com.ipreptech;

public class RevOfNumber {
    public void display(int n){
        int d;
        int a=0;
        while (n!=0){
            d=n%10;
            n=n/10;
            a=a*10+d;
        }
        System.out.println(a);
    }
}
