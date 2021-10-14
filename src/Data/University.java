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

    //methods
   public void addTeacher(Teacher teacher){
        this.teacherList.add(teacher);
   }

   public void addCourse(Course course){
        this.courseList.add(course);
   }

   public void addStudent(Student student){
        this.studentList.add(student);
   }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
}
