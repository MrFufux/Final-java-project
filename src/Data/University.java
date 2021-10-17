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
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
        this.courseList = new ArrayList<>();

    }

    //methods
   public void addTeacher(Teacher teacher) {
       this.teacherList.add(teacher);
   }

   public void addCourse(Course course){
        this.courseList.add(course);
   }

   public void addStudent(Student student){
        this.studentList.add(student);
   }

    public void setAddStudentToCourse(int courseId, int studentId){
        this.courseList.get(courseId-1).setAddStudent(this.studentList.get(studentId -1));
    }

    public void setAddNewCourse(String courseName,int classroomNumber,Teacher teacher){
        this.courseList.add(new Course(courseName, classroomNumber, teacher));
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
