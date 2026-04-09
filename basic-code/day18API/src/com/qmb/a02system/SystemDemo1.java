package com.qmb.a02system;

public class SystemDemo1 {
    /*
    public static void exit(int status) 终止当前运行的java虚拟机
    public static long currentTimeMillis() 返回当前系统的时间毫秒值形式，从时间原点1970.1.1.00:00开始,因为我们处于东8区,所以是从1970.1.1.08:00开始.
    public static void arraycopy(源数据,起始索引,目标数组,起始索引,拷贝个数)  拷贝数组
     **/
    public static void main(String[] args)
    {
        // 方法的形参：状态码
        // 0:表示当前虚拟机是正常停止
        // 非0:表示当前虚拟机是异常停止
        // System.exit(0);

        // long l = System.currentTimeMillis();
        // System.out.println(l);

        // 拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1, 0, arr2, 5, 5);
        for (int x:arr2)
        {
            System.out.println(x);
        }
    }
}
