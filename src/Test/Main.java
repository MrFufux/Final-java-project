package Test;


import Data.Course.Course;
import Data.Student.Student;
import Data.Teachers.FullTimeTeacher;
import Data.Teachers.PartTimeTeacher;
import Data.Teachers.Teacher;
import Data.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean exitApp = true;
        int selection;
        Scanner scan = new Scanner(System.in);
        University universityManitoba = new University();

        //creation of full time teacher
        universityManitoba.addTeacher(new FullTimeTeacher("Ricardo Guantamo", 2000,2));
        universityManitoba.addTeacher(new FullTimeTeacher("Juan Rebolledo", 1000,1));
        universityManitoba.addTeacher(new FullTimeTeacher("Juana de Arco", 3000,3));
        universityManitoba.addTeacher(new FullTimeTeacher("Romina La Buena", 2000,2));

        //creation of part time teacher
        universityManitoba.addTeacher(new PartTimeTeacher("Stalin Hernandez", 500,5));
        universityManitoba.addTeacher(new PartTimeTeacher("Rigoberto Casanueva", 500,5));
        universityManitoba.addTeacher(new PartTimeTeacher("Leandro Jimenez", 900,9));
        universityManitoba.addTeacher(new PartTimeTeacher("Andrea Quintero", 1000,10));

        //creation of students
        universityManitoba.addStudent(new Student(1,"Pancrasita Jimenez", 19));
        universityManitoba.addStudent(new Student(2,"Juan Vera", 17));
        universityManitoba.addStudent(new Student(3,"Rigoberta Pigman", 25));
        universityManitoba.addStudent(new Student(4,"Carlos Granda", 30));
        universityManitoba.addStudent(new Student(5,"Laura Hernandez", 23));
        universityManitoba.addStudent(new Student(6,"Bernardo Casas", 20));

        //Creation of courses
        universityManitoba.addCourse(new Course("Math",101,universityManitoba.getTeacherList().get(0)));
        universityManitoba.addCourse(new Course("Bussiness Planning",801,universityManitoba.getTeacherList().get(4)));
        universityManitoba.addCourse(new Course("Organic Chemistry",207,universityManitoba.getTeacherList().get(6)));
        universityManitoba.addCourse(new Course("Dramatic Art",502,universityManitoba.getTeacherList().get(2)));
        universityManitoba.addCourse(new Course("Architecture III",201, universityManitoba.getTeacherList().get(3)));
/*
        for (Student i:universityManitoba.getStudentList()) {
            System.out.println(i.getStudentName());
        }

        for (Course i: universityManitoba.getCourseList()) {
            System.out.println(i.getCourseName());
        }
*/
        while(exitApp){
            System.out.println("\nHello User! Welcome to the Manitoba Campus of the Awesome University Interface.\n" +
                    "\nPLEASE CHOOSE AN OPTION TO PROCEED: \n" +
                    "(1) Teacher List.\n" +
                    "(2) All the courses at the campus.\n" +
                    "(3) Register a new Student and add it to a course.\n" +
                    "(4) Register a new Course.\n" +
                    "(5) Search Courses by Student\n" +
                    "(6) Exit\n" +
                    "-----------------------------------------------------------"
                    );

            selection = scan.nextInt();

            switch (selection){
                case 1:
                    System.out.println("-------------------------Teachers List-----------------------------");
                    for (Teacher i: universityManitoba.getTeacherList()) {
                        System.out.println(" Id: " + i.getTeacherId() + "\n " + "Name: " + i.getTeacherName() +
                                "\n " + "Base Salary: $" + i.getBaseSalary() + "\n " + "Calculated Salary: $" +
                                i.calculateSalary() + "\n"+" --------------------------------------------" );
                    }
                    break;
                case 2:
                    boolean subOption = true;
                    while(subOption){
                        System.out.println("Select the course to show information: ");
                       for(int i=1; i <= universityManitoba.getCourseList().size();i++){
                           System.out.println(i + " " + universityManitoba.getCourseList().get(i-1).getCourseName());
                       }
                        System.out.println("0 Return");

                       Scanner subOptionScan = new Scanner(System.in);
                       int subElectionOption = subOptionScan.nextInt();

                       if(subElectionOption > 0 && subElectionOption <= universityManitoba.getCourseList().size()){
                            universityManitoba.getCourseList().get(subElectionOption - 1).toString();

                           for (Student i: universityManitoba.getCourseList().get(subElectionOption).getStudentCourseList()) {
                               System.out.println(i.toString());
                           }

                       } else if(subElectionOption == 0){
                           subOption = false;
                       } else {
                           System.out.println("Invalid Option. Try Again.");
                       }

                    }

                    break;
                case 3:
                    System.out.println("-----------Student List--------------");
                    for (Student i:universityManitoba.getStudentList()) {
                        System.out.println( "Student Id: " + i.getIdStudent() +" " + "Student Name: " + i.getStudentName() +
                                " " + "Student Age: " + i.getAge());
                    }
                    Scanner newId = new Scanner(System.in);

                    System.out.println("Type the student's Id: ");
                    int id = newId.nextInt();

                    Scanner newName = new Scanner(System.in);
                    System.out.println("Type the student's name and last name: ");
                    String name = newName.nextLine();

                    Scanner newAge = new Scanner(System.in);
                    System.out.println("Type the student's age: ");
                    int age = newAge.nextInt();

                    universityManitoba.addStudent(new Student(id,name,age));
                    System.out.println("------------Student's List---------------");
                    for (Student i:universityManitoba.getStudentList()) {
                        System.out.println("Id: " + i.getIdStudent() + ". Name: " +
                                i.getStudentName() + ". Age: " + i.getAge() + ".");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("-----------Student List--------------");
                    for (Student i:universityManitoba.getStudentList()) {
                        System.out.println( "Student Id: " + i.getIdStudent() +" " + "Student Name: " + i.getStudentName());
                    }
                    System.out.println("Type the Student's Id that you want to search: ");
                    Scanner scanner = new Scanner(System.in);
                    int option = scanner.nextInt();

                    break;
                case 6:
                    System.out.println("Thanks for using the the Manitoba Campus of the Awesome University. Interface. C you later :D ");
                    exitApp = false;
                    break;
                default:
                    break;
            }
        }






    }
}
