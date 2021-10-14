package Data.Course;

import Data.Student.Student;
import Data.Teachers.Teacher;

import java.util.List;

public class Course {
    //attributes
    private String courseName;
    private int classRoomAssigned;
    private List<Student> studentCourseList;
    private Teacher courseTeacher;

    public Course(String courseName, int classRoomAssigned, Teacher courseTeacher){
        this.courseName = courseName;
        this.classRoomAssigned = classRoomAssigned;
        this.courseTeacher = courseTeacher;
    }

    //methods

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getClassRoomAssigned() {
        return classRoomAssigned;
    }

    public void setClassRoomAssigned(int classRoomAssigned) {
        this.classRoomAssigned = classRoomAssigned;
    }

    public List<Student> getStudentCourseList() {
        return studentCourseList;
    }

    public void setStudentCourseList(List<Student> studentCourseList) {
        this.studentCourseList = studentCourseList;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
}
