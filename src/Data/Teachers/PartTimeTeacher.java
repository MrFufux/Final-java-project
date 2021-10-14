package Data.Teachers;

public class PartTimeTeacher extends Teacher{
    //attributes
    private int hoursPerWeek;

    //Constructor
    public PartTimeTeacher(String name, double salary, int hoursPerWeek) {
        super(name, salary);
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        return this.baseSalary * 0.0052 * hoursPerWeek; //week payment
    }
}
