package com.example.user.myapplication1202_2.data;

import java.util.List;

/**
 * Created by user on 2016/12/2.
 */

public interface StudentDAO {
    public List<Student> getList();
    public void add(Student s);
}
