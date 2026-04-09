package com.qmb.a01generics;


import java.util.Arrays;
import java.util.Objects;

    /*
        当定义一个类时，某个变量的数据类型不确定，就可以定义带有泛型的类
    */
public class MyArrayList<E> {

    Object[] elementData = new Object[10];
    int size;

    public boolean add(E e)
    {
        elementData[size] = e;
        size++;
        return true;
    }

    public E get(int index)
    {
        if(index < size && index >= 0)
            return (E) elementData[index];
        else
            return null;
    }

        @Override
        public String toString() {
            return Arrays.toString(elementData);
        }
    }
