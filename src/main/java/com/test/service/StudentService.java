package com.test.service;

import com.test.bean.Student;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
public interface StudentService {
    public Student findByName(String name) throws Exception;
    public Student  findById(int id) throws Exception;
    public List<Student> findAll() throws Exception;
    public int inseret(Student student) throws Exception;
}
