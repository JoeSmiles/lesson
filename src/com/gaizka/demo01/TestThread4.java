package com.gaizka.demo01;

public class TestThread4 implements Runnable {

    // 票数
    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }

            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "--->拿到了第" + ticketNums-- + "票");
        }
    }

    public static void main(String[] args) {
        TestThread4 testThread = new TestThread4();

        new Thread(testThread, "老师").start();
        new Thread(testThread, "学生").start();
        new Thread(testThread, "黄牛").start();
    }
}
