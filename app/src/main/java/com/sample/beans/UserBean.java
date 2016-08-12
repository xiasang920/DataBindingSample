package com.sample.beans;

/**
 * Created by xiasang on 2016/8/12.
 * 用户类
 */
public class UserBean {
    private String name;
    private int age;
    private String sex;
    private String job;

    public UserBean() {
    }

    public UserBean(String name, int age, String sex, String job) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
