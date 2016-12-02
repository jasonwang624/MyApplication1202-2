package com.example.user.myapplication1202_2.data;

/**
 * Created by user on 2016/12/2.
 */

public class Student {
    int ID;
    String name;
    String tel;
    String addr;

    public Student(int i, String n, String t, String a)
    {
        ID = i;
        name = n;
        tel = t;
        addr = a;
    }
    @Override
    public String toString()
    {
        return "" + ID + "," + name;
    }
}
