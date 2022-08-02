package com.ipreptech;

public class Practice {
    public void pyramidnum(int n){
        for (int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for (int j=i;j>1;--j){
                System.out.print(j);
            }
            for (int j=1;j<=i;++j){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
