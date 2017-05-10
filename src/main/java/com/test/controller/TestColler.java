package com.test.controller;

import com.test.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.test.service.StudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
@Controller
public class TestColler {
    @Autowired
    private StudentService studentService;
    @RequestMapping(value = "action/getall",method = RequestMethod.GET)
    @ResponseBody
   public String getAll(){
        try {
            List<Student> list = new ArrayList<>();
            list = studentService.findAll();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < list.size(); i++) {
                stringBuffer.append(list.get(i).getId()+","+ list.get(i).getName()+","+list.get(i).getScore());
            }
            System.out.print(stringBuffer.toString()+"-------");
            return  stringBuffer.toString();
//            Student student = new Student();
//            student = studentService.findByName("hello");
//             return student.getName()+","+student.getScore();
        }catch (Exception e){
            return  "2222";
        }
   }
}
