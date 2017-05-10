package com.test.mapper;

import com.test.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
@Repository
public interface StudentMapper {
    public Student  findByName(String name);
    public Student  findById(int id);
    public List<Student> findAll();
    public int inseret(Student student);

}
