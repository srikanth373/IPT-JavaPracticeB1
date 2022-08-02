package com.ipreptech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class FibonacciArrList {
    public void display(int n){
        int s1=0;
        int s2=1;
        int sum=0;
        ArrayList<Integer> fibo = new ArrayList<>();
//        LinkedList<Integer> fibo= new LinkedList<>();
//        HashSet<Integer> fibo= new HashSet<>();
            fibo.add(0);
            fibo.add(1);
        for (int  i=2;i<n;i++){
            if (i<=n){
                sum=s1+s2;
                fibo.add(sum);
                s1=s2;
                s2=sum;
            }
        }
        System.out.println(fibo);
    }
}
