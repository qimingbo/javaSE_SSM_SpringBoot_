package com.qmb.oop;

public class User {
    // 书写一个标准的javabean类
    // 补充ptg插件可以直接生成标准的javabean,目前已安装，鼠标右键。
    // 属性
    private String userName;
    private String password;
    private String email;
    private char sex;
    private int age;


    // 构造方法
    public User(){

    }

    public User(String userName, String password,String email, char sex, int age){
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }

    // 方法
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name = " + userName + ", password = " + password + ", email = " + email + ", sex = " + sex + ", age = " + age + "}";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
 class Test {
    public static void main(String[] args) {
        //写一个标准的javabean类
        //咱们在课后只要能把这个标准的javabean能自己写出来，那么就表示今天的知识点就ok了


        //利用空参构造创建对象
        User u1 = new User();
        //如果利用空参创建对象，还想赋值只能用set方法赋值
        u1.setUserName("zhangsan");
        u1.setPassword("1234qwer");
        u1.setEmail("itheima@itcast.cn");
        u1.setSex('男');
        u1.setAge(23);
        //获取属性的值并打印
        System.out.println(u1.getUserName() + ", " + u1.getPassword()
                + ", " + u1.getEmail() + ", " + u1.getSex() + ", " + u1.getAge());

        System.out.println("=============================");

        //简单的办法
        //利用带全部参数的构造来创建对象
        //快捷键:ctrl + p 来查询参数
        User u2 = new User("lisi","12345678","lisi@itcast.cn",'女',24);
        System.out.println(u2.getUserName() + ", " + u2.getPassword()
                + ", " + u2.getEmail() + ", " + u2.getSex() + ", " + u2.getAge());
    }
}