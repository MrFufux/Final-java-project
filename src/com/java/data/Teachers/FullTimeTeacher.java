package com.java.data.Teachers ;

public class FullTimeTeacher extends Teacher {

    //attributes
    private int yearsOfExperience;

    //Constructor
    public FullTimeTeacher(int idCounter, String name, int salary, int yearsOfExperience, String type) {
        super(idCounter, name, salary, type);
        this.yearsOfExperience = yearsOfExperience;
    }

    //methods
    @Override
    public int calculateSalary() {

        return (int) (super.baseSalary * this.yearsOfExperience * 1.10); //110%
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }


}
