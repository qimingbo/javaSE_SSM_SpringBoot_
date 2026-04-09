package com.qmb.studentsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSystem {
    /*
"-------------欢迎来到黑马学生管理系统----------------"
"1：添加学生"
"2：删除学生"
"3：修改学生"
"4：查询学生"
"5：退出"
"请输入您的选择:"
 */
    private static final String ADD_STUDENT = "1";
    private static final String DELETE_STUDENT = "2";
    private static final String UPDATE_STUDENT = "3";
    private static final String QUERY_STUDENT = "4";
    private static final String EXIT = "5";

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
      loop: while (true) {
            System.out.println("-------------欢迎来到黑马学生管理系统----------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.print("请输入您的选择:");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case ADD_STUDENT :
                    addStudent(list);
                    break;
                case DELETE_STUDENT :
                    deleteStudent(list);
                    break;
                case UPDATE_STUDENT :
                    updateStudent(list);
                    break;
                case QUERY_STUDENT :
                    queryStudent(list);
                    break;
                case EXIT :
                    System.out.println("5：退出");
                    break loop;//loop是自己定的，这个break作用范围是跳出外面的循环，不是这个switch。
//                    System.exit(0); 这个作用是结束程序。
                default:   System.out.println("没有这个选项");
            }
        }
    }

    // 键盘录入每一个学生信息并添加，需要满足以下要求：
    // id唯一
    public static void addStudent(List<Student> list)
    {   // 1、键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.print("id：");
        String id = sc.next();
        // 2、判断id是否唯一
        if(contains(id,list))
        {
            System.out.println("id已经存在请重新输入");
            return;
        }
        System.out.print("姓名：");
        String name = sc.next();
        System.out.print("年龄：");
        int age = sc.nextInt();
        System.out.print("住址：");
        String address = sc.next();
        // 3、添加对象
        Student stu = new Student(id, name, age, address);
        list.add(stu);
    }

    //键盘录入要删除的学生id，需要满足以下要求：
    //* id存在删除
    //* id不存在，需要提示不存在，并回到初始菜单
    public static  void deleteStudent(List<Student> list)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的id:");
        String id = sc.next();
        if(!contains(id, list))
        {
            System.out.println("id不存在，删除失败");
            return;
        }
        int index = getIndexById(id, list);
        list.remove(index);
    }

    //键盘录入要修改的学生id，需要满足以下要求
    //* id存在，继续录入其他信息
    //* id不存在，需要提示不存在，并回到初始菜单
    public static void updateStudent(List<Student> list)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改学生的id:");
        String id = sc.next();
        if(!contains(id, list))
        {
            System.out.println("id不存在，请重新输入");
            return;
        }
        System.out.print("请输入学生的姓名：");
        String name = sc.next();
        System.out.print("请输入学生的年龄：");
        int age = sc.nextInt();
        System.out.print("请输入学生的地址：");
        String address = sc.next();
        int index = getIndexById(id, list);
        Student stu = new Student(id, name, age, address);
        list.set(index, stu);
    }

    // 打印所有的学生信息，需要满足以下要求
    //* 如果没有学生信息，提示：当前无学生信息，请添加后再查询
    //* 如果有学生信息，需要按照以下格式输出。（不用过于纠结对齐的问题）
    public static void queryStudent(List<Student> list)
    {
        int len = list.size();
        if(len == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getId()+"\t");
            System.out.print(list.get(i).getName()+"\t");
            System.out.print(list.get(i).getAge()+"\t");
            System.out.println(list.get(i).getAddress());
        }
    }

    // 判断id,是否唯一
    public static boolean contains(String id, List<Student> list)
    {
        return getIndexById(id, list) >= 0;
    }
    // 返回指定id下的索引
    public static int getIndexById(String id,List<Student> list)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id))
                return i;
        }
        return  -1;
    }
}
