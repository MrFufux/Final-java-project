package Test;


import Data.Teachers.FullTimeTeacher;
import Data.Teachers.PartTimeTeacher;
import Data.Teachers.Teacher;
import Data.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int selection;
        Scanner scan = new Scanner(System.in);
        University universityManitoba = new University();

        //creation of a teacher full time
        universityManitoba.addTeacher(new FullTimeTeacher("Ricardo Guantamo", 2000,2));
        universityManitoba.addTeacher(new FullTimeTeacher("Juan Rebolledo", 1000,1));
        universityManitoba.addTeacher(new FullTimeTeacher("Juana de Arco", 3000,3));
        universityManitoba.addTeacher(new FullTimeTeacher("Romina La Buena", 2000,2));
        universityManitoba.addTeacher(new FullTimeTeacher("Santiago Gomez", 3000,3));
        universityManitoba.addTeacher(new FullTimeTeacher("Jimena Florez", 4000,4));
        universityManitoba.addTeacher(new FullTimeTeacher("John Doe", 1000,1));
        universityManitoba.addTeacher(new FullTimeTeacher("Adolfo Hitler", 1000,1));

        //partime
        universityManitoba.addTeacher(new PartTimeTeacher("Stalin", 90000,90));


        for (Teacher i: universityManitoba.getTeacherList()) {
            System.out.println(i.getTeacherName());
        }

        System.out.println("\nHello User! Welcome to the Manitoba Campus of the Awesome University. Interface.\n\n" +
                "PLEASE CHOOSE AN OPTION TO PROCEED: \n" +
                "(1) Teacher List.\n" +
                "(2) All the courses at the campus.\n" +
                "(3) Courses List" +
                "(4) Register a new Student.\n" +
                "(5) Register a new Course.\n" +
                "(6) Exit");

        selection = scan.nextInt();

        switch (selection){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                break;
        }





    }
}
