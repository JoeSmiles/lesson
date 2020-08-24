package com.gaizka.demo01;

public class TestThread3 implements Runnable{



    public static void main(String[] args) {


        // 创建runnable接口的实现类对象
        TestThread3 thread = new TestThread3();

        new Thread(thread).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程--- " + i);
        }

    }

    @Override
    public void run() {
        // run 方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我在看代码---- " + i);
        }
    }
}
