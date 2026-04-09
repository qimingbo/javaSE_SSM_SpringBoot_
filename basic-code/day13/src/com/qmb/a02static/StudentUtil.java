package com.qmb.a02static;

import java.util.List;

// 学生工具类，用于获取集合中最大学生的年龄。
public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAgeSyudent(List<Student> list)
    {
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if(age > maxAge)
                maxAge = age;
        }
        return maxAge;
    }
}
