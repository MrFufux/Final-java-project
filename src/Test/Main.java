package Test;


import Data.University;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        int selection;

        Scanner scan = new Scanner(System.in);

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
