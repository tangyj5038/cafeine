package com.tyj.caffeine.guava;

import com.google.common.collect.ComparisonChain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;


//ComparisonChain
public class ComparisonChainTest {


    public static void main(String[] args) {

        People p1 = new People("zhangsan1", 20);
        People p2 = new People("zhangsan1", 21);
        People p3 = new People("zhangsan2", 19);
        System.out.println(p1.compareTo(p2));//-1
        System.out.println(p1.compareTo(p3));//1

    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class People implements  Comparable<People>{

    private String name;
    private int age;





    @Override
    public int compareTo(People o) {


        return ComparisonChain.start()
                .compare(this.age,o.age)
                .result();
    }
}