package com.ipreptech;

public class RightAngTriangle {
    public void display(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;i>=j;j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }
}
