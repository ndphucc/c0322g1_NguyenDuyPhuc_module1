package FunramaResort.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee() {
    }

    public Employee(String level, String position, double salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String citizenIdentification, String phoneNumber, String email, String level, String position, double salary) {
        super(id, name, dateOfBirth, gender, citizenIdentification, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                " id = " + super.getId() +
                ", name = " + super.getName() + '\'' +
                ", dateOfBirth = " + super.getDateOfBirth() + '\'' +
                ", gender = " + super.getGender() + '\'' +
                ", citizenIdentification = " + super.getCitizenIdentification() + '\'' +
                ", phoneNumber = " + super.getPhoneNumber() + '\'' +
                ", email = " + super.getEmail() + '\'' +
                "level = " + level + '\'' +
                ", position = " + position + '\'' +
                ", salary = " + salary +
                '}';
    }
}
