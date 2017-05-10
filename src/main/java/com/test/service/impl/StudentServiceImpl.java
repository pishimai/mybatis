package com.test.service.impl;

import com.test.bean.Student;
import com.test.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.service.StudentService;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper mapper;
    @Override
    public List<Student> findAll() throws Exception{
        return mapper.findAll();
    }

    @Override
    public Student findById(int id) throws Exception{
        return null;
    }

    @Override
    public int inseret(Student student) throws Exception{
        return 0;
    }

    @Override
    public Student findByName(String name) throws Exception{
        return mapper.findByName(name);
    }
}
