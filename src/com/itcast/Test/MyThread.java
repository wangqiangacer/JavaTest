package com.itcast.Test;

public class MyThread implements Runnable{
    private  int[][] arr;

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" \t");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
            }
    }
}
