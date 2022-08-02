package com.ipreptech;

public class Search {
    public boolean display(int n){
        int[] array={17,23,56,15,9,12};
        for (int i=0;i<array.length;i++){
            if(array[i]==n){
                return true;
            }
        }
        return false;
    }
    public void check(){
        boolean check = display(6);
        if (check == true) {
            System.out.println("find the value");
        }
        else System.out.println("not find the value");
    }
}
