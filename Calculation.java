package com.ipreptech;


public class Calculation {
         int a;
         int b;

    public Calculation(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        System.out.println(a+b);
        return a+b;
    }
    public int sub(){
        System.out.println(a-b);
        return a-b;
    }
    public int mul(){
        System.out.println(a*b);
        return a*b;
    }
    public int div(){
        System.out.println(a/b);
        return a/b;
    }
    public int rem(){
        System.out.println(a%b);
        return a%b;
    }

}
