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
    public String getTeacherName() {
        return teacherName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }


    //abstract methods
    public abstract int calculateSalary();


}
