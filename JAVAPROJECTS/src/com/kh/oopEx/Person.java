package com.kh.oopEx;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "유저정보{" + "name=" + name + ", age=" + age + "}";
    }
}
