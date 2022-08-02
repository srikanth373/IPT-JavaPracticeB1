package com.ipreptech;

public class ArmstrongNumber {
    public void display(int n){
        for (int i=1;i<=n;i++){
            int p=i;
           int d1=p%10;
           p=p/10;
           int d2=p%10;
           p=p/10;
           int d3=p%10;
           p=p/10;
           int d4=p%10;
            int Arm=((d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3)+(d4*d4*d4));
            if(Arm==i){
                System.out.println(Arm+"="+"is Armstorng number");
            }
        }
    }
}
