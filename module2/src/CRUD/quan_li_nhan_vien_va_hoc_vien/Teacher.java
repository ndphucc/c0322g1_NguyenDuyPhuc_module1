package CRUD.quan_li_nhan_vien_va_hoc_vien;

public class Teacher extends Person{
    private double salary= 3000000;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, int age, String gender, double salary) {
        super(id, name, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString()+
                "salary=" + salary +
                '}';
    }
}
