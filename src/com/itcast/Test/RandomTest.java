package com.itcast.Test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import javax.sql.ConnectionPoolDataSource;
import java.io.File;
import java.io.InputStream;
import java.util.*;

public class RandomTest {
    public static void main(String[] args) throws Exception {
        //1.获取mingdan.xml的path
        //String path = RandomTest.class.getClassLoader().getResource("mingdan.xml").getPath();
        InputStream inputStream = RandomTest.class.getClassLoader().getResource("mingdan.xml").openStream();
        //2.获取Document对象
        Document document = Jsoup.parse(inputStream, "utf-8", "");
        //Document document = Jsoup.parse(new File(path), "utf-8");
        Elements elements = document.getElementsByTag("name");
        String text = elements.get(0).text();
        String s = text.replaceAll("'", "");
        String s1 = s.replaceAll(",", "");
        String[] students = s1.split(" ");
      /*  for (String student : students) {
            System.out.print(student+",");
        }
        System.out.println();*/

        Collections.shuffle(Arrays.asList(students));
       /* for (String student : students) {
            System.out.print(student+",");
        }*/
        Random random = new Random();
       int i = random.nextInt(students.length-25) + 25;
       //int i=5;i
        System.out.println("随机的抽中的幸运号码是多少呢？？？");
        System.out.println();
        int[][] ints = new int[7][7];
        int count = 1;
        for (int i1 = 0; i1 < ints.length; i1++) {
            for (int i2 = 0; i2 < ints[i1].length; i2++) {
                ints[i1][i2] = count++;
            }
        }
        createArray(ints,i,students);
        for (int i1 = 0; i1 < students.length; i1++) {
            if (i1 == i) {
                System.out.println("恭喜你  " + students[i1] + "  该你演讲了！！！");
            }
        }
    }
    public static int[][] createArray(int[][] arr ,int index, String[] students) {
        int i1 = (index-1) % 7;
        int j1 = (index-1 - i1) / 7;

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +"\t");
                if (i==j1&&j==i1) {
                    System.out.println(students[index]);
                   return null;
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
        return arr;
        }

}

