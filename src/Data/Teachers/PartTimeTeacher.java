package Data.Teachers;

public class PartTimeTeacher extends Teacher{
    //attributes
    private int hoursPerWeek;

    //Constructor
    public PartTimeTeacher(String name, double salary, int hoursPerWeek) {
        super(name, salary);
        this.hoursPerWeek = hoursPerWeek;
    }

    //methods
    @Override
    public double calculateSalary() {
        return this.baseSalary * 0.0052 * hoursPerWeek; //week payment
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }
}
