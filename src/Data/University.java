package Data;

import Data.Course.Course;
import Data.Student.Student;
import Data.Teachers.Teacher;


import java.util.ArrayList;
import java.util.List;

public class University {
    //Attributes
    List<Student> studentList;
    List<Teacher> teacherList;
    List<Course> courseList;

    //Constructor
    public University(){
        this.studentList = new ArrayList<Student>();
        this.teacherList = new ArrayList<Teacher>();
        this.courseList = new ArrayList<Course>();

    }



}
