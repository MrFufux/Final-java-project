package com.java.data.Course;

import com.java.data.Student.Student;
import com.java.data.Teachers.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String courseName;
    private int classRoomAssigned;
    private List<Student> studentCourseList;
    private List<Teacher> teacherCourseList;
    private Teacher courseTeacher;


    public Course(String courseName, int classRoomAssigned, Teacher courseTeacher){
        this.courseName = courseName;
        this.classRoomAssigned = classRoomAssigned;
        this.courseTeacher = courseTeacher;
        this.studentCourseList = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public List<Student> getStudentCourseList() {
        return studentCourseList;
    }

    public void setAddStudent(Student student){
        this.studentCourseList.add(student);
    }

    public List<Teacher> getTeacherCourseList() {

        return teacherCourseList;
    }

}

