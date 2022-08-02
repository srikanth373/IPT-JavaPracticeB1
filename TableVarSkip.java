package com.ipreptech;

public class TableVarSkip {
    public void display(int n){
        int p;
        for(int i=1;i<=20;i++){
            p=n*i;
            if((n<=7)&&(n>1)){
                if ((i==12)||(i==15)){
                    continue;
                }
                System.out.println(n+"*"+i+"="+p);
            }
            else if (n>7){
                if (i>=11){
                    break;
                }
                System.out.println(n+"*"+i+"="+p);
            }

        }
    }
}
