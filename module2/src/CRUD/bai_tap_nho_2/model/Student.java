package CRUD.bai_tap_nho_2.model;

public class Student extends Person {
    private String studentId;
    private Double averagePoint;

    public Student() {
    }

    public Student(String id, String name, String gender, String dateOfBirth, String address, String studentId, Double averagePoint) {
        super(id, name, gender, dateOfBirth, address);
        this.studentId = studentId;
        this.averagePoint = averagePoint;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getAveragePoint() {
        return averagePoint;
    }

    public void setAveragePoint(Double averagePoint) {
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "studentId='" + studentId + '\'' +
                ", averagePoint=" + averagePoint +
                '}';
    }

    @Override
    public String getInfor() {
        return super.getId()+","+
                super.getName()+","+
                super.getGender()+","+
                super.getDateOfBirth()+","+
                super.getAddress()+","+
                this.studentId+","+
                this.averagePoint;
    }
}
