package com.ipreptech;

public class TableSkip {
    public void display() {
        int p;
        for (int j = 2; j <= 7; j++) {
            for (int i = 1; i <= 20; i++) {
                p = j* i;
                if ((i == 12) || (i == 15)) {
                    continue;
                }
                System.out.println(j + "*" + i + "=" + p);
            }
        }
    }
}
