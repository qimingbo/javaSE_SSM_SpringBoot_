package com.qmb.a02stream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //    一堆零散数据  public static <T> Stream<T> of(T...values)          Stream接口中的静态方法
        Stream.of("张三","李四","王五","赵六","钱七").forEach(s -> System.out.println(s));

        // 注意:
        // Stream接口中静态方法of的细节:
        // 方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        // 但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        Stream.of(arr1).forEach(s -> System.out.println(s));
    }
}
