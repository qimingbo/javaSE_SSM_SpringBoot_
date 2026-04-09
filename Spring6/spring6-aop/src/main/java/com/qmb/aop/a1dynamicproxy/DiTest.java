package com.qmb.aop.a1dynamicproxy;

import org.junit.jupiter.api.Test;

public class DiTest {
    @Test
    public void testDemo1()
    {
        Calculator target = new CalculatorImpl();
        Calculator proxy = ProxyFatory.getProxy(target);
        int result = proxy.sub(1, 3);
    }

}
