package com.ipreptech;

public class LeftAngTriangle {
    public void display(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/***





    *
   **
  ***
 ****
*****





 */
