package com.qmb.spring.iocxml.a5dimap;

import java.util.Map;

public class Student {
    private Map<String, Teacher> teacherMap;

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherMap=" + teacherMap +
                '}';
    }
}
