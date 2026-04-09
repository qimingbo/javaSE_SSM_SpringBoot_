package com.qmb.a05objects;

import javax.xml.transform.Result;
import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
        public static boolean equals(Object a,object b) 先做非空判断，比较两个对象
        public static boolean isNull(object obj) 判断对象是否为nu11,为nu11返回true,反之为false
        public static boolean nonNull(object obj) 判断对象是否为nu11,跟isNu11的结果相反
         */
        // 创建两个对象
        Student s1 = null;
        Student s2 = new Student("zhangsan",20);
        // 比较两个对象.如果调用者为空需要自己去写一堆代码去判断。我们想让java帮我们写。
//        if(s1 != null){
//            boolean result =  s1.equals(s2);
//            System.out.println(result);
//        }else {
//            System.out.println("调用者为空");
//        }

        boolean result = Objects.equals(s1, s2);
        System.out.println(result);
        // 细节:
        // 1.方法底层会先判读s1是否为null,若为null直接返回false;否则调用s1的equals方法
        // 2.s1是Student类型,所以最终还是会调用Student中的equals方法。
        // 3.如果Student没有重写equals方法，则比较地址值。重写就比较属性值。

        System.out.println(Objects.isNull(s1));

        System.out.println(Objects.nonNull(s1));

    }
}
