package com.itcast.Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据：");
        int i = scanner.nextInt();
        int[][] arr=new int[i][i];
        MyThread myThread = new MyThread();
        myThread.setArr(arr);
        Thread thread=new Thread(myThread);
        thread.start();
    }
}
