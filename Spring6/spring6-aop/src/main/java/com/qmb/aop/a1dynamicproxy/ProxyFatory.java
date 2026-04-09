package com.qmb.aop.a1dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFatory {
    public static Calculator getProxy(Calculator target)
    {
        Calculator proxyInstance = (Calculator)Proxy.newProxyInstance(ProxyFatory.class.getClassLoader(),
                new Class[]{Calculator.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object result = null;
                        try {
                            System.out.println("[动态代理][日志] " + method.getName() + "，参数：" + Arrays.toString(args));
                            result = method.invoke(target, args);
                            System.out.println("[动态代理][日志] " + method.getName() + "，结果：" + result);
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("[动态代理][日志] " + method.getName() + "，异常：" + e.getMessage());
                        } finally {
                            System.out.println("[动态代理][日志] " + method.getName() + "，方法执行完毕");
                        }
                        return result;
                    }
                }
        );
        return proxyInstance;
    }
}
