package com.ipreptech;

public class TableOfNumber {
    public void display(int n){
        int p;
        for (int i=1;i<=20;i++){
            p=n*i;
            System.out.println(n+"*"+i+"="+p);
        }
    }
}
