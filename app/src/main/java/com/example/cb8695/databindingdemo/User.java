package com.example.cb8695.databindingdemo;

/**
 * Created by cb8695 on 2016/2/22.
 */
public class User {
    //域的修饰符不可写错，否则会编译不过
    public final int age;
    public final String name;

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
