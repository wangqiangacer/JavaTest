package com.itcast.Test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo {
    @Test
    public void test1(){
        Random random = new Random();
        int[] arr=new int[100];
        for (int i = 0; i < arr.length; i++) {
            int i1 = random.nextInt(100) + 1;
            System.out.print(i1+" ");
            arr[i]=i1;
        }
        System.out.println();
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("最大值是"+max);
    }
    @Test
    public void arrayreverse(){
        //数组的反转
        System.out.print("反转前：");
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=i;
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.print("反转后：");
            for(int min=0,max=arr.length-1;min<=max;min++,max--){
                //用中间容器交换
                int temp=arr[min];
                arr[min]=arr[max];
                arr[max]=temp;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    @Test
    public void  test2(){

        //首先定义一个二维数组
        //int[][] array=new int[3][3];
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //arr[0]代表数组{1,2,3}
        //arr[0]={1,2,3}
        System.out.println(arr[0][0]);//表示了二维数组中的第一个一维数组中的第一个元素
        System.out.println("===============");
        for(int x=0;x<arr[0].length;x++){
            System.out.print(arr[0][x]);
        }
        //arr[1]={4,5,6}
        for(int x=0;x<arr[1].length;x++){
            System.out.print(arr[1][x]);
        }
        //arr[2]={7,8,9}
        for(int x=0;x<arr[2].length;x++){
            System.out.print(arr[2][x]);
        }

    }
    @Test
    public void test3(){
        //首先定义一个二维数组
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        //这是二维数组的长度
        for(int x=0;x<arr.length;x++){
            //对二维数组中的每一个数组遍历
            for(int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]);
            }
        }
    }
    @Test
    public void  test4(){
        String[][] arr=new String[8][];
        for (int i = 0; i < arr.length; i++) {
            //构建二维数组给每一层赋值
            arr[i]=new String[i+1];
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    @Test
    public void  test5(){
        //三维数组
        int[][][] arr=new int[3][4][5];
        System.out.println(arr.length);//二维数组的个数
        System.out.println(arr[0].length);//一维数组的个数
        System.out.println(arr[0][0].length);//一维数组的长度
        //二维数组的个数
        for(int x=0;x<arr.length;x++){
            //一维数组的个数
            for(int y=0;y<arr[x].length;y++){
                //一维数组的中的每一个元素
                for(int z=0;z<arr[x][y].length;z++){
                    System.out.print(arr[x][y][z]);
                }
                System.out.println();//二维换行
            }
            System.out.println();//三维换行
        }
    }
}
