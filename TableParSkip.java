package com.ipreptech;

public class TableParSkip {
    public void display(int n){
        int p;
        if ((n<=7)&&(n<1)){
            for(int i=1;i<=20;i++){
                p=n*i;
                if((i==12)||(i==15)){
                    continue;
                }
                System.out.println(n+"*"+i+"="+p);
            }
        }
        else if(n>7){
            for(int i=1;i<=10;i++){
                p=n*i;
                System.out.println(n+"*"+i+"="+p);
            }
        }
    }

}
