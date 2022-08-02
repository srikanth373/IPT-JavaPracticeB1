package com.ipreptech;

public class DigitsOfNumber {
    public void display(){
        int i=1369;
        while(i!=0){
            System.out.println(i%10);
            i=i/10;
        }
    }
}
