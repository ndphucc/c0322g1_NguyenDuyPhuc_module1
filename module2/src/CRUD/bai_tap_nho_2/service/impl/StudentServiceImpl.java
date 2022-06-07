package CRUD.bai_tap_nho_2.service.impl;

import CRUD.bai_tap_nho_2.model.Student;
import CRUD.bai_tap_nho_2.service.StudentService;
import CRUD.bai_tap_nho_2.util.GetProperties;
import CRUD.bai_tap_nho_2.util.ReadAndWriteFile;
import CRUD.bai_tap_nho_cong_ty_abc.util.ComparatorDateOfBirth;
import CRUD.bai_tap_nho_cong_ty_abc.util.ComparatorName;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    static Scanner scanner = new Scanner(System.in);
    public static List<Student> studentList = new LinkedList<>();
    static final String PATH = "src/CRUD/bai_tap_nho_2/data/student.csv";

    @Override
    public void add() {
        readFile();
        studentList.add(new Student(GetProperties.getId(), GetProperties.getName(), GetProperties.getGender(), GetProperties.getDateOfBirth(), GetProperties.getAddress(), GetProperties.getStudentId(), GetProperties.getAveragePoint()));
        System.out.println("Đã thêm thành công");
        writeFile();
    }

    @Override
    public void display() {
        readFile();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Override
    public void remove() {
        readFile();
        do {
            System.out.println("Nhập id bạn muốn xóa");
            String id = scanner.nextLine();
            for (Student student : studentList) {
                if (student.getId().equals(id)) {
                    System.out.println("bạn muốn xóa " + student);
                    do {
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                studentList.remove(student);
                                System.out.println("bạn đã xóa thành công");
                                writeFile();
                                return;
                            case "2":
                                System.out.println("Xóa không thành công");
                                return;
                            default:
                                System.out.println("lựa chọn không hợp lệ vui lòng chọn lại");
                        }
                    } while (true);

                }
            }
            System.out.println("id không tồn tại");
        } while (true);
    }

    @Override
    public void sortName() {
        readFile();
        Collections.sort(studentList, new ComparatorName());
        writeFile();
    }


    @Override
    public void edit() {
        readFile();
        do {
            System.out.println("Nhập id bạn muốn sửa");
            String id = scanner.nextLine();
            for (Student student : studentList) {
                if (student.getId().equals(id)) {
                    student.setName(GetProperties.getName());
                    student.setGender(GetProperties.getGender());
                    student.setDateOfBirth(GetProperties.getDateOfBirth());
                    student.setAddress(GetProperties.getAddress());
                    student.setStudentId(GetProperties.getStudentId());
                    student.setAveragePoint(GetProperties.getAveragePoint());
                    writeFile();
                    return;
                }
            }
            System.out.println("id không tồn tại");
        } while (true);
    }

    @Override
    public void sortDateOfBirth() {
        readFile();
        Collections.sort(studentList, new ComparatorDateOfBirth());
        writeFile();
    }

    public void writeFile() {
        ReadAndWriteFile.clearFile(PATH);
        for (Student student : studentList) {
            String line = student.getInfor();
            ReadAndWriteFile.writeFile(PATH, line);
        }
    }

    public void readFile() {
        studentList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile(PATH);
        for (String[] line : strings) {
            studentList.add(new Student(line[0], line[1], line[2], line[3], line[4], line[5], Double.parseDouble(line[6])));
        }
    }

}
