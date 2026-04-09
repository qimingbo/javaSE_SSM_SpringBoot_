package com.qmb.a05interclass;

public class Outer {

   private class Inner{

    }

    public Inner getInstance()
    {
        return new Inner();
    }
}
