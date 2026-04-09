package com.qmb.a01generics;

import java.util.ArrayList;

public class GenericsDemo5 {
    public static void main(String[] args) {
        /*
            泛型不具备继承性，但是数据具备继承性
          */
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        method(list1);

//        method(list2);
//        method(list3);
    }

    public static void method(ArrayList<Ye> list) {

    }
}
