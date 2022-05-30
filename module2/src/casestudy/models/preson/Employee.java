package casestudy.models.preson;

import java.util.Date;

public class Employee extends Person {
    private String level;
    private String location;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String age, boolean gender, int identityCard, int phoneNumber, String mail, String level, String location, int salary) {
        super(id, name, age, gender, identityCard, phoneNumber, mail);
        this.level = level;
        this.location = location;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
