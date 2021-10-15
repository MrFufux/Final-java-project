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
        universityManitoba.addTeacher(new FullTimeTeacher("Santiago Gomez", 3000,3));
        universityManitoba.addTeacher(new FullTimeTeacher("Jimena Florez", 4000,4));
        universityManitoba.addTeacher(new FullTimeTeacher("John Doe", 1000,1));
        universityManitoba.addTeacher(new FullTimeTeacher("Adolfo de Jesús Hitler", 1000,1));

        //creation of part time teacher
        universityManitoba.addTeacher(new PartTimeTeacher("Stalin Hernandez", 500,5));
        universityManitoba.addTeacher(new PartTimeTeacher("Rigoberto Casanueva", 500,5));
        universityManitoba.addTeacher(new PartTimeTeacher("Leandro Jimenez", 900,9));
        universityManitoba.addTeacher(new PartTimeTeacher("Andrea Quintero", 1000,10));
        universityManitoba.addTeacher(new PartTimeTeacher("Luisa Loaiza", 800,8));
        universityManitoba.addTeacher(new PartTimeTeacher("Ana Milerga", 700,7));
        universityManitoba.addTeacher(new PartTimeTeacher("Christian Gomez", 900,9));
        universityManitoba.addTeacher(new PartTimeTeacher("Benedict Baufthein", 600,6));

        //creation of students
        universityManitoba.addStudent(new Student(1,"Pancrasita Jimenez", 19));
        universityManitoba.addStudent(new Student(2,"Juan Vera", 17));
        universityManitoba.addStudent(new Student(3,"Andres Fuentes", 19));
        universityManitoba.addStudent(new Student(4,"Rigoberta Pigman", 25));
        universityManitoba.addStudent(new Student(5,"Carlos Granda", 30));

        //Creation of courses
        universityManitoba.addCourse(new Course("Math",101,universityManitoba.getTeacherList().get(0)));
        universityManitoba.addCourse(new Course("Bussiness Planning",801,universityManitoba.getTeacherList().get(4)));
        universityManitoba.addCourse(new Course("Organic Chemistry",207,universityManitoba.getTeacherList().get(6)));
        universityManitoba.addCourse(new Course("Dramatic Art",502,universityManitoba.getTeacherList().get(2)));


        for (Student i:universityManitoba.getStudentList()) {
            System.out.println(i.getStudentName());
        }

        for (Course i: universityManitoba.getCourseList()) {
            System.out.println(i.getCourseName());
        }

        while(exitApp){
            System.out.println("\nHello User! Welcome to the Manitoba Campus of the Awesome University. Interface.\n\n" +
                    "PLEASE CHOOSE AN OPTION TO PROCEED: \n" +
                    "(1) Teacher List.\n" +
                    "(2) All the courses at the campus.\n" +
                    "(3) Register a new Student.\n" +
                    "(4) Register a new Course.\n" +
                    "(5) Exit");

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

                    break;
                case 3:
                    Scanner newId = new Scanner(System.in);

                    System.out.println("Type the student's Id: ");
                    int id = newId.nextInt();

                    Scanner newName = new Scanner(System.in);
                    System.out.println("Type the student's name: ");
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
                    System.out.println("Thanks for using the the Manitoba Campus of the Awesome University. Interface. C you later :D ");
                    exitApp = false;
                    break;
                default:
                    break;
            }
        }






    }
}
