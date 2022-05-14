package CRUD.quan_li_nhan_vien_va_hoc_vien;

public class Student extends Person{
    private double point = 5;

    public Student(double point) {
        this.point = point;
    }

    public Student() {
    }

    public Student(int id, String name, int age, String gender, double point) {
        super(id, name, age, gender);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

//    @Override
//    public String toString() {
//        return "Student{" + super.toString()+
//                "point=" + point +
//                '}';
//    }
}
