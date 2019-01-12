package com.itcast.MyThread;

public class Demo  {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        Thread t1 = new Thread(thread);
        t1.start();
        Thread t2 = new Thread(thread);
        t2.start();
        Thread t3 = new Thread(thread);
        t3.start();
    }
}
