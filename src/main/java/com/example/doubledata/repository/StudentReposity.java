package com.example.doubledata.repository;

import com.example.doubledata.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program: doubledata
 * @description:
 * @author: Mr.Cui
 * @createDate: 2019-04-24 11:02
 * @since
 **/
@Repository
public abstract class StudentReposity implements JpaRepository<Student,String> {


}
