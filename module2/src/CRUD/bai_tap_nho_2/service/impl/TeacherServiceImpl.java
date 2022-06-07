package CRUD.bai_tap_nho_2.service.impl;

import CRUD.bai_tap_nho_2.model.Teacher;
import CRUD.bai_tap_nho_2.service.TeacherService;
import CRUD.bai_tap_nho_2.util.GetProperties;
import CRUD.bai_tap_nho_2.util.ReadAndWriteFile;
import CRUD.bai_tap_nho_cong_ty_abc.util.ComparatorDateOfBirth;
import CRUD.bai_tap_nho_cong_ty_abc.util.ComparatorName;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements TeacherService {
    static Scanner scanner = new Scanner(System.in);
    public static List<Teacher> teacherList = new LinkedList<>();
    static final String PATH = "src/CRUD/bai_tap_nho_2/data/teacher.csv";

    @Override
    public void add() {
        readFile();
        teacherList.add(new Teacher(GetProperties.getId(), GetProperties.getName(), GetProperties.getGender(), GetProperties.getDateOfBirth(), GetProperties.getAddress(), GetProperties.getSalary(), GetProperties.getTimeNumber()));
        System.out.println("Đã thêm thành công");
        writeFile();
    }

    @Override
    public void display() {
        readFile();
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void remove() {
        readFile();
        do {
            System.out.println("Nhập id bạn muốn xóa");
            String id = scanner.nextLine();
            for (Teacher teacher : teacherList) {
                if (teacher.getId().equals(id)) {
                    System.out.println("bạn muốn xóa " + teacher);
                    do {
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "1":
                                teacherList.remove(teacher);
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
        Collections.sort(teacherList, new ComparatorName());
        writeFile();
        System.out.println("Sắp xếp thành công");
    }


    @Override
    public void edit() {
        readFile();
        do {
            System.out.println("Nhập id bạn muốn sửa");
            String id = scanner.nextLine();
            for (Teacher teacher : teacherList) {
                if (teacher.getId().equals(id)) {
                    teacher.setName(GetProperties.getName());
                    teacher.setGender(GetProperties.getGender());
                    teacher.setDateOfBirth(GetProperties.getDateOfBirth());
                    teacher.setAddress(GetProperties.getAddress());
                    teacher.setSalary(GetProperties.getSalary());
                    teacher.setTimeNumber(GetProperties.getTimeNumber());
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
        Collections.sort(teacherList, new ComparatorDateOfBirth());
        writeFile();
    }

    public void writeFile() {
        ReadAndWriteFile.clearFile(PATH);
        for (Teacher teacher : teacherList) {
            String line = teacher.getInfor();
            ReadAndWriteFile.writeFile(PATH, line);
        }
    }

    public void readFile() {
        teacherList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile(PATH);
        for (String[] line : strings) {
            teacherList.add(new Teacher(line[0], line[1], line[2], line[3], line[4], Double.parseDouble(line[5]), Double.parseDouble(line[6])));
        }
    }

}
