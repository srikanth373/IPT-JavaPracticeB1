package com.ipreptech;

import java.util.Scanner;

public class BinarySearchReverse {
    public int finding(int f){
        int[] array = {98,68,65,54,50,23,13,11,6,4,3,2};

        int low=0;
        int high=11;
        for (;low<=high;){
            int mid=(low+high)/2;
            if (array[mid]==f){
                return mid;
            } else if (array[mid]<f) {
                high=mid-1;
            } else low = mid+1;
        }
        return -1;
    }

    public void checking(int f){
        int a =finding(f);
        if(a==-1){
            System.out.println("Not available in the array");
        } else System.out.println("Available in the array");
    }
}
