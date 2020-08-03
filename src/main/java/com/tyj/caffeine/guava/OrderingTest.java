package com.tyj.caffeine.guava;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

//Ordering
public class OrderingTest {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student("zhangsan5",20,90));
        list.add(new Student("zhangsan5",19,91));
        list.add(new Student("zhangsan3",19,88));
        list.add(new Student("zhangsan1",18,100));
        list.add(new Student("zhangsan1",17,100));

        list.stream().forEach(student -> System.out.println(student));

        //Ordering
        Ordering<Student> scoreOrdering = Ordering.natural().reverse().onResultOf(Student::getScore);
        Ordering<Student> ageOrdering = Ordering.natural().onResultOf(Student::getAge);
        Ordering<Student> nameOrdering = Ordering.natural().onResultOf(Student::getName);

        Ordering<Student> compound = scoreOrdering.compound(ageOrdering).compound(nameOrdering);
        list.sort(compound);

        System.out.println("-------------------------");
        list.stream().forEach(student -> System.out.println(student));
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Student {

    private String name;
    private int age;
    private int score;

}