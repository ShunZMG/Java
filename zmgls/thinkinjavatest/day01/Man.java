package com.zmgls.thinkinjavatest.day01;

public class Man extends Person {

    public Man(int age) {
        super(age);
        // TODO 自动生成的构造函数存根
    }

    public void get(Person person) {

    }

    public static void main(String[] args) { // 方法
        Person ls = new Person(18, "male");
        Person zmg = new Person(18);
        // System.out.println(ls.getAge());
        System.out.println(ls.setAge(20, "s33t"));
        // System.out.println(ls.getSex());
        // zmg.setAge(19);
        // System.out.println(zmg.getAge());
    }
}

class Person {
    // 成员变量
    private int age;
    private String sex;

    // 成员方法
    public String setAge(int age, String sex) {
        this.age = age;
        return "不一样的setAge";
    }

    public Boolean setAge(int age) {
        return true;
    }

    public String getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }
}
