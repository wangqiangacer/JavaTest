package com.itcast.Test1;

import java.util.*;

/**
 * @Author: Administrator
 * @CreateTime: 2019-01-03 16:57
 * @Description: ${Description}
 */
//要求根据年龄排序
public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, User> map = new HashMap<>();
        map.put(1,new User("小明",15));
        map.put(2,new User("小李",12));
        map.put(3,new User("小强",20));
        map.put(4,new User("小化",23));
        HashMap<Integer, User> sortMap = sortMap(map);
        System.out.println(sortMap);

    }

    public  static HashMap<Integer, User> sortMap(HashMap<Integer, User> map){
        //拿到map键值对集合
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();
        //将set转为list集合
        List<Map.Entry<Integer, User>> list = new ArrayList<Map.Entry<Integer, User>>(entrySet);
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                return o1.getValue().getAge()-o2.getValue().getAge();
            }
        });

        HashMap<Integer,User> LinkHashMap=new LinkedHashMap<>();
        for (Map.Entry<Integer, User> entry : list) {
            LinkHashMap.put(entry.getKey(),entry.getValue());
        }
        return LinkHashMap;

    }
}
