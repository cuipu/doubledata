package com.example.doubledata.web.controller;

import com.example.doubledata.model.Student;
import com.example.doubledata.repository.StudentReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: doubledata
 * @description:
 * @author: Mr.Cui
 * @createDate: 2019-04-24 11:04
 * @since
 **/

@RequestMapping("/studnet")
public class StudentController {

    @Autowired
    private StudentReposity studentReposity;

    @GetMapping("/findAll")
    public List<Student> findAllStudents(){
        return studentReposity.findAll();
    }
}
