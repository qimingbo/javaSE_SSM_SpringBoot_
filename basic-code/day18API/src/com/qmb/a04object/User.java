package com.qmb.a04object;

import java.util.StringJoiner;

// Cloneable接口
//如果一个接口中没有任何抽象方法，表示当前接口是一个标记性接口。现在Cloneable表示一旦实现了,那么当前类的对象就可以被克隆；如果没有实现，当前类的对象就不可以克隆。
public class User implements Cloneable  {
    private int id; //游戏角色
    private String username; //用户名
    private String password; //密码
    private String path; //游戏图片
    private int[] data; //游戏进度


    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " + arrToString() + "}";
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    // 自己手动编写深克隆代码
    @Override
    protected Object clone() throws CloneNotSupportedException {
        int len = this.data.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = this.data[i];
        }
        User u = (User) super.clone();
        u.setData(arr);
        return u;
    }

}
