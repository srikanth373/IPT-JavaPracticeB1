package com.ipreptech;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrList {
    public static void diplay() {
        ArrayList<Integer> varname = new ArrayList<Integer>();
        varname.add(12);
        varname.add(15);
        varname.add(66);
        varname.add(45);
        varname.add(1, 56);
        varname.remove(0);
        System.out.println(varname);

    }

    public static void print() {
        LinkedList<Integer> varname = new LinkedList<>();
        varname.add(51);
        varname.add(62);
        varname.add(55);
        varname.add(41);
        varname.add(18);
        varname.add(68);
        varname.add(68);
        varname.add(1,22);
        varname.add(3,54);
        varname.remove(5);
//        varname.remove(8);
        System.out.println(varname);


    }

    public static void show() {
        HashSet<Integer> varname = new HashSet<>();
        varname.add(61);
        varname.add(61);
        varname.add(61);
        varname.add(89);
        varname.add(89);
        varname.add(68);
        varname.add(68);
        varname.add(11);
        varname.add(11);
        varname.remove(5);
//        varname.remove(8);
        System.out.println(varname);

    }

    }


