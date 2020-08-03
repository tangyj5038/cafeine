package com.tyj.caffeine.guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultimapTest {

    public static void main(String[] args) {
        //Multimap就是将相同key的value值放在一个list里面, 这是一个很实用的类
        Multimap<String,String> mmap = ArrayListMultimap.create();
        mmap.put("k1","v11");
        mmap.put("k1","v12");
        mmap.put("k1","v13");
        mmap.put("k2","v21");
        mmap.put("k2","v22");
        System.out.println(mmap);//{k1=[v11, v12, v13], k2=[v21, v22]}
        System.out.println(mmap.get("k1"));//[v11, v12, v13]
    }

}
