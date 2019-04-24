package com.example.doubledata.model;

import java.util.Date;

/**
 * @program: doubledata
 * @description:
 * @author: Mr.Cui
 * @createDate: 2019-04-24 11:00
 * @since
 **/
public class Student {

    private String s_id;

    private String s_name;

    private Date s_birth;

    private String s_sex;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Date getS_birth() {
        return s_birth;
    }

    public void setS_birth(Date s_birth) {
        this.s_birth = s_birth;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "s_id='" + s_id + '\'' +
                ", s_name='" + s_name + '\'' +
                ", s_birth=" + s_birth +
                ", s_sex='" + s_sex + '\'' +
                '}';
    }
}
