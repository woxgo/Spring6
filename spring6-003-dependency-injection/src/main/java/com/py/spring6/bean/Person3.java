package com.py.spring6.bean;

import java.util.Set;

public class Person3 {


    private Set<Student> studentSet;

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "studentSet=" + studentSet +
                '}';
    }
}
