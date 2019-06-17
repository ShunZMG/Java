package com.zmgls.thinkinjavatest.quotetest;

// package com.zmgls.thinkinjavatest.quotetest;
/**
 * 引用测试 t2 = t1; t1、t2均为引用，将t1赋值给t2，即将t2改为对t1所引用的对象的引用
 */
public class QuoteTest {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.set("abc");
        System.out.println(t1.get());
        t2 = t1;
        t2.set("diie");
        System.out.println(t1.get());
    }
}

class Test {
    private String teststr;

    public String get() {
        return teststr;
    }

    public void set(String str) {
        this.teststr = str;
    }
}