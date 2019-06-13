package com.zmgls.thinkinjavatest.statictest;

/**
 * static 关键字
 * 1.当声明一个事物是 static 时，就意味着这个域或者方法不会与包含它的那个类的任何对象实例关联在一起
 * 2.下面的代码中，即使创建了两个StaticTest对象，但是，StaticTest.i也只有一份存储空间
 * 3.引用static变量有两种方法：
 *      1)通过一个对象去定位static变量：st1.i
 *      2)通过其类名直接进行引用，对于非静态成员不可这样引用：StaticTest.i++；
 * 4.类似逻辑也应用与静态方法，可以通过一个对象来引用某个静态方法，也可以通过特殊的语法形式 ClassName.method()加以引用
 */
public class StaticTest{
    protected static int i= 47;

    public static void main(String[] args) {

        //静态变量引用
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        System.out.println(st1.i); //1.通过 “对象.静态变量”引用
        System.out.println(st2.i);

        StaticTest.i++; //2.通过“类名.静态变量”引用
        System.out.println(StaticTest.i);
        System.out.println(st1.i);
        st1.i++;
        System.out.println(st2.i);

        //静态方法引用
        Incrementable sf = new Incrementable();
        sf.increment(); //1.通过“对象.静态方法”引用
        System.out.println(StaticTest.i);

        Incrementable.increment(); //2.通过“类名.静态方法”引用
        System.out.println(StaticTest.i);
    }
}

//静态方法定义
class Incrementable{
    static void increment(){
        StaticTest.i++;
    }
}