package com.itcast.Test;

/**冒泡排序两两比较
 * @Author: Administrator
 * @CreateTime: 2019-01-01 13:42
 * @Description: ${Description}
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] num={2,7,1,5,8,3,0};
        //外循环控制轮数
        int temp;//用来做临时交换变量
        for(int i=0;i<num.length-1;i++){
            //内循环控制每轮比较的次数
            for(int j=0;j<num.length-1-i;j++){
                //如果两两比较前面的数比后面的数大则交换位置
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("排序后的顺序为");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
    }
}
