package com.java.data.Teachers;

public class PartTimeTeacher extends Teacher{
    private int hoursPerWeek;

    public PartTimeTeacher(int idCounter, String name, int salary, int hoursPerWeek, String type) {
        super(idCounter,name, salary, type);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public int calculateSalary() {
        return (int) (super.baseSalary * 0.0052 * hoursPerWeek); //week payment
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
