package com.qmb.a02exceptiontest;

public class GrilFriend {
    private String name;
    private int age;


    public GrilFriend() {
    }

    public GrilFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        int length = name.length();
        if(length < 3 || length > 10)
        {
            throw new NameFormatException(name + "格式有误，长度应该为：3~10");
        }
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age)  {
        if(age < 18 || age > 40)
        {
            throw new AgeFormatException(age + "超出了范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GrilFriend{name = " + name + ", age = " + age + "}";
    }
}
