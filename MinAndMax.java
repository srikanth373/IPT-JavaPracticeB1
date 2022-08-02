package com.ipreptech;

public class MinAndMax {
    public int MinOf2(int a,int b){
        if(a==b) {
            System.out.println("Both values are equal");
            return a;
        }

        if (a > b) {
                System.out.println(b + " is minimum");
                return b;
            }
        System.out.println(a + " is minimum");
        return a;

    }






    public int MaxOf2(int a,int b){
       if(a==b) {
           System.out.println("Both values are equal");
           return a;
       }
        if (a > b) {
               System.out.println(a + "is maximum");
               return a;
        }
        else {
               System.out.println(b + "is maximum");
               return b;
        }
    }






    public int MinOf3(int a,int b, int c) {
        if(a==b && b==c && c==a){
            System.out.println("All values are equal");
            return a;
        }
        else if((a<=b)&&(b<=c)){
            System.out.println(a+"is minimum");
            return a;
        } else if ((b<=c)&&(c<=a)){
            System.out.println(b+"is minimum");
            return b;
        } else
            System.out.println(c+"is minimum");
        return c;
    }











    public int MaxOf3(int a,int b, int c){
        if(a==b && b==c && c==a){
            System.out.println("All values are equal");
            return a;
        }
        else if((a>=b)&&(b>=c)){
            System.out.println(a+"is maximum");
            return a;
        } else if ((b>=c)&&(c>=a)){
            System.out.println(b+"is maximum");
            return b;
        } else
            System.out.println(c+"is maximum");
        return c;
    }
}
