package com.itcast.Test;

import java.util.Scanner;

public class DemoYangHui {
    public static void main(String[] args) {
        //杨辉三角
         /*1
         * 1  1
         * 1  2  1
         * 1  3  3  1
         * 1  4  6  4  1
         * 1  5  10  10  5  1
         * */
        //规律：arr[x][y]=arr[x-1][y-1]+arr[x-1][y]
        //从第三行开始每一行的数据是它上一行前一列和它上一行本列的数据之和
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数据：");

        int n = scanner.nextInt();
        //定义一个二维数组
        int[][] arr=new int[n][n];
        //第一列的数据和最后一列的数据赋值1
        for (int x = 0; x < arr.length; x++) {
            arr[x][0]=1;
            arr[x][x]=1;
        }
        //从第三行开始每一行的数据是它上一行前一列和它上一行本列的数据之和
        for(int x=2;x<arr.length;x++){
            for(int y=1;y<=x-1;y++){
                arr[x][y]=arr[x-1][y-1]+arr[x-1][y];
            }
        }
        for (int x = 0; x < arr.length; x++) {
            for(int y=0;y<=x;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }
}
