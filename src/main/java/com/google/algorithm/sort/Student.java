package com.google.algorithm.sort;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Student implements Comparable<Student> {
    private String username;
    private int age;

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}
