package com.qmb.a01exception;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo1 {
    public static void main(String[] args) throws ParseException {
        // 编译时异常(在编译阶段，必须手动处理，否则代码报错)
        String time = "2030年1月1日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);
        System.out.println(date);

    }
}
