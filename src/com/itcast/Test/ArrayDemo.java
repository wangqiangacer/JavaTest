package com.itcast.Test;

public class ArrayDemo {
    public static void main(String[] args) {
        // 三维数组赋值
        String[][][] dataArray = null;
        // 假定有3页
        dataArray = new String[3][][];
        for (int page = 0; page < dataArray.length; page++) {
            // 假定每页有4行
            dataArray[page] = new String[4][];
            for (int row = 0; row < dataArray[page].length; row++) {
                // 假定每页每行有5列
                dataArray[page][row] = new String[5];
                for (int col = 0; col < dataArray[page][row].length; col++) {
                    // 进行赋值
                    dataArray[page][row][col] = "page=" + page + ";row=" + row
                            + ";col=" + col;
                }
            }
        }
        // 三维数组遍历输出
        for (int page = 0; page < dataArray.length; page++) {
            for (int row = 0; row < dataArray[page].length; row++) {
                for (int col = 0; col < dataArray[page][row].length; col++) {
                    System.out.println(dataArray[page][row][col]);
                }
            }
        }
    }
}
