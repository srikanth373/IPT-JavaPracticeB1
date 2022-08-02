package com.ipreptech;

public class Tables {
    public static void display(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("@s");
            }
            System.out.println();
        }
    }
}
