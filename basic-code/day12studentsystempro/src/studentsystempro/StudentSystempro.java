package studentsystempro;

import java.util.*;

public class StudentSystempro {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作1登录 2注册 3忘记密码 4退出");
            String choose1 = sc.next();
            switch (choose1){
                case "1":
                    {
                        login(userList);
                        break;
                    }
                case "2":
                    {
                        register(userList);
                        break;
                    }
                case "3":
                        forgetPassword(userList);
                        break;
                case "4":
                        System.exit(0);
                        break;
                default:
                        System.out.println("没有这个功能");
            }
        }

    }

    // 注册功能
    /*1，用户名需要满足以下要求：验证要求：用户名唯一 、用户名长度必须在3~15位之间 、只能是字母加数字的组合，但是不能是纯数字
​	  2，密码键盘输入两次，两次一致才可以进行注册。
​	  3，身份证号码需要验证。验证要求：长度为18位、不能以0为开头、前17位，必须都是数字、最为一位可以是数字，也可以是大写X或小写x
​	  4，手机号验证。验证要求：长度为11位、不能以0为开头、必须都是数字
      */
    public static void register(List<User> userList)
    {
        // 1、用户名校验
        Scanner sc = new Scanner(System.in);
        String userName = null;
        while (true) {
            System.out.print("请输入用户名：");
            userName = sc.next();
            boolean flag1 = checkUserName(userName);
            if(! flag1) {
                System.out.println("格式不满足，请重新输入");
                continue;
            }
            // 用户名唯一性校验
            boolean flag2 = containsUserName(userName,userList);
            if(flag2) {
                System.out.println("用户名存在请重新输入：");
            }else {
                System.out.println("用户名" + userName + "可用");
                break;
            }
        }

        // 2、密码校验
        String password = null;
        while (true) {
            System.out.print("请输入密码：");
            password = sc.next();
            System.out.print("请再次输入密码：");
            String confirm = sc.next();
            if(!password.equals(confirm)) {
                System.out.println("两次密码不一致");
                continue;
            }else{
                System.out.println("两次密码一致");
                break;
            }
        }

        // 3、身份证校验
        String idNumber = null;
        while (true) {
            System.out.print("请输入身份证号：");
            idNumber = sc.next();
            boolean flag3 = checkIdNumber(idNumber);
            if(!flag3){
                System.out.println("身份证号有误，请重新输入");
                continue;
            }else{
                break;
            }
        }

        // 4、手机号校验
        String phoneNumber = null;
        while (true) {
            System.out.print("请输入手机号：");
            phoneNumber = sc.next();
            boolean flag4 = checkPhoneNumber(phoneNumber);
            if(!flag4){
                System.out.println("手机号有误，请重新输入");
                continue;
            }else {
                break;
            }
        }

        // 5、创建用户对象
        User user = new User(userName, password, idNumber, phoneNumber);
        userList.add(user);
        System.out.println("注册成功");
        System.out.println(user);
    }


    // 登录功能
    /*
      ​	1，键盘录入用户名
​	    2，键盘录入密码
​	    3，键盘录入验证码
        验证要求：用户名如果未注册，直接结束方法，并提示：用户名未注册，请先注册。判断验证码是否正确，如不正确，重新输入。再判断用户名和密码是否正确，有3次机会
    */
    public static void login(List<User> userList)
    {
        //键盘输入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ) {
            System.out.print("请输入用户名：");
            String userName = sc.next();
            if(!containsUserName(userName, userList))
            {
                System.out.println("用户名未注册，请先注册");
                return ;
            }
            System.out.print("请输入密码：");
            String password = sc.next();
            String veriCode = generateVeriCode();
            System.out.println("验证码:" + veriCode);
            while (true) {
                System.out.print("请输入验证码：");
                String inputVeriCode = sc.next();
                if(veriCode.equals(inputVeriCode))
                    break;
                else
                    System.out.println("验证码错误，请重新输入");
            }
            User user = new User(userName, password, null, null);
            boolean flag5 = checkUserInfo(user, userList);
            if(flag5){
                StudentSystem.startStudentSystem();
            }else{
                if(i == 2) System.out.println("当前账号" + userName + "被锁定，请联系管理员");
                else System.out.println("用户名或密码错误，还剩下" + (2 - i) + "次机会");
            }
        }
    }

    // 找回密码
    /*
     1，键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，并提示：未注册
​	2，键盘录入身份证号码和手机号码
​	3，判断当前用户的身份证号码和手机号码是否一致，
​			如果一致，则提示输入密码，进行修改。
​			如果不一致，则提示：账号信息不匹配，修改失败。
     **/
    public static void forgetPassword(List<User> userList)
    {
        System.out.print("请输入用户名:");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        if(!containsUserName(userName,userList))
        {
            System.out.println("当前用户" + userName + "未注册,请先注册");
            return;
        }

        int index = getIndexByUserName(userName, userList);
        System.out.print("请输入身份证号：");
        String idNumber = sc.next();
        System.out.print("请输入手机号：");
        String phoneNumber = sc.next();
        if(!(userList.get(index).getIdNumber().equals(idNumber) && userList.get(index).getPhoneNumber().equals(phoneNumber)))
        {
            System.out.println("身份证号或手机号输入有误，不能修改密码");
            return;
        }
        while (true) {
            System.out.print("请输入新密码：");
            String newPassword = sc.next();
            System.out.print("请再次输入新密码：");
            String againPassword = sc.next();
            if(newPassword.equals(againPassword)){
                userList.get(index).setPassword(newPassword);
                break;
            }else {
                System.out.println("两次密码输入不一致，请重新输入");
                continue;
            }
        }
    }


    // 返回指定用户名下的索引
    public static int getIndexByUserName(String userName,List<User> list)
    {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getUserName().equals(userName))
                return i;
        }
        return  -1;
    }
    // 判断用户名,是否唯一
    public static boolean containsUserName(String userName, List<User> list)
    {
        return getIndexByUserName(userName, list) >= 0;
    }

    // 生成验证码函数
    /*
     长度为5
​	由4位大写或者小写字母和1位数字组成，同一个字母可重复
​	数字可以出现在任意位置
     **/
    public static String generateVeriCode()
    {
        // 创建52个大小写字母字符
        char[] chs = new char[52];
        for (int i = 0; i < 52; i++) {
            if(i < 26)
                chs[i] = (char)('A' + i);
            else
                chs[i] = (char) ('a' + i - 26);
        }
        // 定义字符串
        char[] ch = new char[5];
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            int randIndex = rd.nextInt(52);
            ch[i] = chs[randIndex];
        }
        ch[4] = (char)('0' + rd.nextInt(10));
        // 打乱
        for (int i = 0; i < ch.length; i++) {
            int randIndex = rd.nextInt(5);
            char temp = ch[i];
            ch[i] = ch[randIndex];
            ch[randIndex] = temp;
        }
        return new String(ch);
    }

    // 校验用户名的格式
    private static boolean checkUserName(String userName) {
        // 用户名长度校验
        int len = userName.length();
        if(len < 3 || len > 15)
        {
            System.out.println("用户名长度不符合");
            return false;
        }
        // 用户名格式校验
        for (int i = 0; i < userName.length(); i++) {
            char ch = userName.charAt(i);
            if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))){
                System.out.println("存在字母数字之外字符");
                return false;
            }
        }
        // 统计字母个数
        int count = 0;
        for (int i = 0; i < userName.length(); i++) {
            char ch = userName.charAt(i);
            if(!(ch >= '0' && ch <= '9'))
                count++;
        }
        return count > 0;
    }

    // 校验身份证号格式
    public static boolean checkIdNumber(String idNumber)
    {
        // 身份证长度校验
        if(idNumber.length() != 18) {
            return false;
        }
        if(idNumber.startsWith("0")) {
            return false;
        }
        // 身份证非法字符校验
        for (int i = 0; i < idNumber.length() - 1; i++) {
            if(idNumber.charAt(i) < '0' || idNumber.charAt(i) > '9') {
                System.out.println("身份证存在非法字符");
            }
        }
        // 身份证最后一位校验
        char endChar = idNumber.charAt(17);
        if(!((endChar >= '0' && endChar <= '9')|| endChar == 'x' || endChar == 'X')) {
            return false;
        }
        return true;
    }

    // 校验手机号格式
    public static boolean checkPhoneNumber(String phoneNumber)
    {
        if(phoneNumber.length() != 11 || phoneNumber.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if(ch < '0' && ch > '9') {
                return false;
            }
        }
        return true;
    }

    // 用户名密码登录
    public static boolean checkUserInfo(User userInfo, List<User> userList)
    {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if(user.getUserName().equals(userInfo.getUserName()) && user.getPassword().equals(userInfo.getPassword()))
                return true;
        }
        return false;
    }
}
