package Data.Teachers;

public abstract class Teacher {

    //attributes
    protected String teacherName;
    protected double baseSalary;
    protected int teacherId;

    private static int idCounter = 1;

    //constructor
    public Teacher(String name, double salary){
        this.teacherName = name;
        this.baseSalary = salary;
        this.teacherId = this.idCounter++;
    }

    //methods
    public abstract double calculateSalary();


}
