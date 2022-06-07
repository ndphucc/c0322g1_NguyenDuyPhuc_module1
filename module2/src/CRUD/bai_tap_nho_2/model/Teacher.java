package CRUD.bai_tap_nho_2.model;

public class Teacher extends Person{
    private String className;
    private double salary;
    private double timeNumber;

    public Teacher() {
    }

    public Teacher(String id, String name, String gender, String dateOfBirth, String address, double salary, double timeNumber) {
        super(id, name, gender, dateOfBirth, address);
        this.salary = salary;
        this.timeNumber = timeNumber;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTimeNumber() {
        return timeNumber;
    }

    public void setTimeNumber(double timeNumber) {
        this.timeNumber = timeNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" Teacher{" +
                "className='" + className + '\'' +
                ", salary=" + salary +
                ", timeNumber=" + timeNumber +
                '}';
    }

    @Override
    public String getInfor() {
        return super.getId()+","+
                super.getName()+","+
                super.getGender()+","+
                super.getDateOfBirth()+","+
                super.getAddress()+","+
                this.salary+","+
                this.timeNumber;
    }
}
