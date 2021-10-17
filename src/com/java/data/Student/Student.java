package com.java.data.Student;

import java.util.List;

public class Student {
    //attributes
    private int idStudent;
    private String studentName;
    private int age;

    //constructor
    public Student(int idStudent, String studentName, int age){
        this.idStudent = idStudent;
        this.studentName = studentName;
        this.age = age;
    }

    //methods
    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        return ("--------------------\n" +"Id: " + getIdStudent()+ "\n" + "Name: " + getStudentName() +
                "\n" + "Age: " + getAge() + "\n--------------------\n");
    }

}
