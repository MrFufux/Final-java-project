package com.java.data.runner;


import com.java.data.Course.Course;
import com.java.data.Student.Student;
import com.java.data.Teachers.FullTimeTeacher;
import com.java.data.Teachers.PartTimeTeacher;
import com.java.data.Teachers.Teacher;
import com.java.data.University;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean exitApp = true;
        int selection;
        Scanner scan = new Scanner(System.in);

        University universityManitoba = new University();

        //creation of full time teacher
        universityManitoba.addTeacher(new FullTimeTeacher(1,"Ricardo Guantamo", 2000, 2, "Full Time Teacher"));
        universityManitoba.addTeacher(new FullTimeTeacher(2,"Juan Rebolledo", 1000, 1, "Full Time Teacher"));
        universityManitoba.addTeacher(new FullTimeTeacher(3,"Juana de Arco", 3000, 3, "Full Time Teacher"));
        universityManitoba.addTeacher(new FullTimeTeacher(4,"Romina La Buena", 2000, 2, "Full Time Teacher"));

        //creation of part-time teacher
        universityManitoba.addTeacher(new PartTimeTeacher(5,"Stalin Hernandez", 500, 5, "Part Time Teacher"));
        universityManitoba.addTeacher(new PartTimeTeacher(6,"Rigoberto Casanueva", 500, 5, "Part Time Teacher"));
        universityManitoba.addTeacher(new PartTimeTeacher(7,"Leandro Jimenez", 900, 9, "Part Time Teacher"));
        universityManitoba.addTeacher(new PartTimeTeacher(8,"Andrea Quintero", 1000, 10, "Part Time Teacher"));

        //creation of students
        universityManitoba.addStudent(new Student(1, "Pancrasita Jimenez", 19));
        universityManitoba.addStudent(new Student(2, "Juan Vera", 17));
        universityManitoba.addStudent(new Student(3, "Rigoberta Pigman", 25));
        universityManitoba.addStudent(new Student(4, "Carlos Granda", 30));
        universityManitoba.addStudent(new Student(5, "Laura Hernandez", 23));
        universityManitoba.addStudent(new Student(6, "Bernardo Casas", 20));

        //Creation of courses
        universityManitoba.addCourse(new Course("Math", 101, universityManitoba.getTeacherList().get(0)));
        universityManitoba.addCourse(new Course("Bussiness Planning", 102, universityManitoba.getTeacherList().get(1)));
        universityManitoba.addCourse(new Course("Organic Chemistry", 103, universityManitoba.getTeacherList().get(2)));
        universityManitoba.addCourse(new Course("Dramatic Art", 104, universityManitoba.getTeacherList().get(3)));
        universityManitoba.addCourse(new Course("Architecture III", 105, universityManitoba.getTeacherList().get(4)));

        //Adding students to a Course
        universityManitoba.setAddStudentToCourse(1,1);
        universityManitoba.setAddStudentToCourse(1,2);

        universityManitoba.setAddStudentToCourse(2,3);
        universityManitoba.setAddStudentToCourse(2,4);

        universityManitoba.setAddStudentToCourse(3,5);
        universityManitoba.setAddStudentToCourse(3,6);

        universityManitoba.setAddStudentToCourse(4,2);
        universityManitoba.setAddStudentToCourse(4,5);

        universityManitoba.setAddStudentToCourse(5,4);
        universityManitoba.setAddStudentToCourse(5,6);




        /*
        for (Student i:universityManitoba.getStudentList()) {
            System.out.println(i.getStudentName());
        }
        */
        for (Course i: universityManitoba.getCourseList()) {
            System.out.println(i);
        }


        while (exitApp) {
            System.out.println("\nHello User! Welcome to the Manitoba Campus of the Awesome University Interface.\n" +
                    "\nPLEASE CHOOSE AN OPTION TO PROCEED: \n" +
                    "(1) Teacher List.\n" +
                    "(2) All the courses at the campus.\n" +
                    "(3) Register a new Student.\n" +
                    "(4) Register a new Course and add a student to a course.\n" +
                    "(5) Search Courses by Student\n" +
                    "(6) Exit\n" +
                    "-----------------------------------------------------------"
            );

            selection = scan.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("-------------------------Teachers List-----------------------------");
                    for (Teacher i : universityManitoba.getTeacherList()) {
                        System.out.println(" Id: " + i.getTeacherId() + "\n " + "Name: " + i.getTeacherName() +
                                "\n " + "Base Salary: $" + i.getBaseSalary() + "\n " + "Calculated Salary: $" +
                                i.calculateSalary() + "\n" + " Teacher Type: " + i.getTeacherType() + "\n" +
                                " --------------------------------------------");
                    }
                    break;

                case 2:
                    boolean subOption = true;
                    while (subOption) {
                        System.out.println("Select the course to show information: ");
                        for (int i = 1; i <= universityManitoba.getCourseList().size(); i++) {
                            System.out.println(i + " " + universityManitoba.getCourseList().get(i-1).getCourseName());
                        }
                        System.out.println("0 Return");

                        Scanner subOptionScan = new Scanner(System.in);
                        int subElectionOption = subOptionScan.nextInt();

                        if (subElectionOption > 0 && subElectionOption <= universityManitoba.getCourseList().size()) {
                            universityManitoba.getCourseList().get(subElectionOption-1).toString();

                            for (Student i : universityManitoba.getCourseList().get(subElectionOption-1).getStudentCourseList()) {
                                System.out.println(i.toString());
                            }

                        } else if (subElectionOption == 0) {
                            subOption = false;
                        } else {
                            System.out.println("Invalid Option. Try Again.");
                        }

                    }
                    break;

                case 3:
                    System.out.println("Select an Option: \n(1) Create a Student \n(2) Add Student to a Course \n(0) Return");
                    Scanner newId = new Scanner(System.in);
                    System.out.println("-----------Student Id List--------------");
                    for (Student i : universityManitoba.getStudentList()) {
                        System.out.println("Id: " + i.getIdStudent() + "\n--------------------------------");
                    }

                    System.out.println("Type the student's new Id: ");
                    int id = newId.nextInt();

                    Scanner newName = new Scanner(System.in);
                    System.out.println("Type the student's name and last name: ");
                    String name = newName.nextLine();

                    Scanner newAge = new Scanner(System.in);
                    System.out.println("Type the student's age: ");
                    int age = newAge.nextInt();

                    universityManitoba.addStudent(new Student(id, name, age));
                    System.out.println("Student Successfully added!\n");
                    System.out.println("------------Student's List---------------");
                    for (Student i : universityManitoba.getStudentList()) {
                        System.out.println("Id: " + i.getIdStudent() + ". Name: " +
                                i.getStudentName() + ". Age: " + i.getAge() + ".");
                    }
                    break;

                case 4:
                    boolean subMenu4 = true;
                    while(subMenu4){
                        Scanner subMenu3Scanner = new Scanner(System.in);
                        System.out.println("Select an Option: \n(1) Create a Course \n(2) Add Student to a Course \n(0) Return");
                        int subMenu4Select = subMenu3Scanner.nextInt();

                        switch (subMenu4Select){
                            case 1:
                                Scanner scanned = new Scanner(System.in);
                                System.out.println("Type the name of the new course: ");
                                String newCourse = scanned.nextLine();

                                System.out.println("Type the assigned classroom: ");
                                int newClassRoom = scanned.nextInt();
                                System.out.println("-------------------------Teachers List-----------------------------");
                                for (Teacher i : universityManitoba.getTeacherList()) {
                                    System.out.println(" Id: " + i.getTeacherId() + "\n " + "Name: " + i.getTeacherName() + "\n" +
                                            " --------------------------------------------");
                                }
                                System.out.println("Please add the Id of the teacher that you want to add to the new Course: ");
                                Scanner sc = new Scanner(System.in);
                                int teacherName = sc.nextInt();

                                universityManitoba.setAddNewCourse(newCourse,newClassRoom,
                                        universityManitoba.getTeacherList().get(teacherName -1));
                                System.out.println("Your new course is successfully created!\n");

//                               for (Course i: universityManitoba.getCourseList()) {
//                                    System.out.println(i);
//                                }
                                break;
                            case 2:
                                for (Student i:universityManitoba.getStudentList()) {
                                    System.out.println("Student Id: " + i.getIdStudent() + " Student Name: " + i.getStudentName());
                                }

                                System.out.println("Type the Id of the Student that you're going to Add: ");
                                Scanner subMenu4Scanner = new Scanner(System.in);
                                int studentId = subMenu4Scanner.nextInt();
                                for (Course i: universityManitoba.getCourseList()) {
                                    System.out.println(i.getCourseName());
                                }
                                System.out.println("Type the Id of the course that the student will be added: ");
                                int courseId = subMenu4Scanner.nextInt();

                                if(studentId > 0 && courseId > 0 && studentId <= universityManitoba.getStudentList().size() && courseId <= universityManitoba.getCourseList().size())
                                {
                                    universityManitoba.setAddStudentToCourse(courseId,studentId);
                                    System.out.println(universityManitoba.getCourseList().get(courseId).getStudentCourseList().get(studentId).toString());
                                } else{
                                    System.out.println("Wrong option. Try again.");
                                }
                                break;
                            case 0:
                                subMenu4 = false;
                                break;
                            default:
                                System.out.println("Invalid option. Try again.");
                                break;
                        }
                    }
                        break;
                case 5:
                    System.out.println("-----------Student List--------------");
                    for (Student e : universityManitoba.getStudentList()) {
                        System.out.println("Id: " + e.getIdStudent() + " " + "Student Name: " + e.getStudentName());
                    }
                    System.out.println("Type the Student's Id that you want to search: ");
                    Scanner scanner = new Scanner(System.in);
                    int option = scanner.nextInt();
                    if(option > 0 && option <= universityManitoba.getStudentList().size()){
                        System.out.println("\n------------------------------------------------------------------");
                        System.out.println(universityManitoba.getStudentList().get(option -1).getStudentName() +
                                " is registered in the following courses: \n");
                        for (Course e: universityManitoba.getCourseList()){
                            for (Student o: e.getStudentCourseList()){
                                if(option == o.getIdStudent()){
                                    System.out.println(e.getCourseName());
                                }
                            }
                        }
                        System.out.println("\n------------------------------------------------------------------");
                    }

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

