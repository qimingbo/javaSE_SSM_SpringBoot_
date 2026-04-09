package com.qmb.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
* 类的作用：
*   创建一个代理
* */
public class ProxyUtil {
     /*
     * 方法的作用：
     *          给一个明星对象，创建一个代理
     *
     *  形参：被代理的明显对象
     *
     *  返回值：
     *       给明星创建的代理
     *
     *
     *
     *
     * 需求：
     *   外面的人想要大明星唱一首歌
     *   1. 获取代理的对象
     *      代理对象 = ProxyUtil.createProxy(大明星的对象);
     *   2. 再调用代理的唱歌方法
     *      代理对象.唱歌的方法("只因你太美");
     */




     public static Star createProxy(BigStar bigStar)
     {
    /* java.lang.reflect.Proxy类：提供了为对象产生代理对象的方法：

        public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情*/
        Star star = (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(), // 参数一：用于指定用哪个类加载器，去加载生成的代理类
                new Class[]{Star.class}, // 参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
                new InvocationHandler() { //参数三：用来指定生成的代理对象要干什么事情

                    @Override
                    // 参数1：代理对象
                    // 参数2：代理要运行的方法,例如sing方法
                    // 参数3：运行行方法的参数,例如sing方法的参数
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("sing".equals(method.getName()))
                        {
                            System.out.println("准备话筒,开始唱歌");
                        }else{
                            System.out.println("准备舞台,开始跳舞");
                        }
                        return method.invoke(bigStar,args);
                    }
                }
        );
        return  star;
     }

}
