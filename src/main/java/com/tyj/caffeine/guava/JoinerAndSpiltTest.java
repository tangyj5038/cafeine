package com.tyj.caffeine.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JoinerAndSpiltTest {

    public static void main(String[] args) {

        ArrayList<String> strings = Lists.newArrayList("a", "b", "c", null,"d");
        //skipNulls()：跳过空元素
        System.out.println(Joiner.on("-").skipNulls().join(strings));//a-b-c-d
        //useForNull()：使用nullText替换空字符串
        System.out.println(Joiner.on("-").useForNull("A").join(strings));//a-b-c-A-d
        //System.out.println(Joiner.on("-").join(strings));//报错


        Map<String,String> map = new HashMap<String,String>();
        map.put("k1","v1");
        map.put("k2","v2");
        //将map封装成字符串，以“，”连接每一组key-value；以“：”连接key和value
        System.out.println(Joiner.on(",").withKeyValueSeparator(":").join(map));//k1:vi,k2:v2


        String str = "a--b- c-d ";
        //trimResults():去除拆分后的字符串的前后空格
        System.out.println(Splitter.on("-").trimResults().splitToList(str));//[a, , b, c, d]
        //omitEmptyStrings():去除拆分后空的字符串
        System.out.println(Splitter.on("-").omitEmptyStrings().splitToList(str));//[a, b,  c, d ]

        String str2 = "aaBBccDD";
        //以固定长度分割字符串
        System.out.println(Splitter.fixedLength(2).splitToList(str2));//[aa, BB, cc, DD]


        String str3 = "iamaveryverygoodstudent";
        //保留某个字符(char)
        System.out.println(CharMatcher.is('a').retainFrom(str3));//aa
        CharMatcher cm = CharMatcher.is('r').or(CharMatcher.is('y'));//ryry
        System.out.println(cm.retainFrom(str3));


    }
}
