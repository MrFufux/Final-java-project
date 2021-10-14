package Data.Teachers ;

public class FullTimeTeacher extends Teacher {

    //attributes
    private int yearsOfExperience;

    //Constructor
    public FullTimeTeacher(String name, double salary, int yearsOfExperience) {
        super(name, salary);
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary * 1.10 ; //110%
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
