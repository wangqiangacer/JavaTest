package com.itcast.MyThread;

public class MyThread implements  Runnable{
    private  int Ticket =100;
    @Override
    public void run() {
        while (true){
            synchronized (this) {
                if(Ticket>0){
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                        System.out.println(Thread.currentThread().getName()+"正在卖第"+Ticket+"票");
                        Ticket--;


                }
            }

        }
    }
}
