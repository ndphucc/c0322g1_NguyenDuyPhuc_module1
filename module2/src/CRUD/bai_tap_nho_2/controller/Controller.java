package CRUD.bai_tap_nho_2.controller;

import CRUD.bai_tap_nho_2.service.impl.StudentServiceImpl;
import CRUD.bai_tap_nho_2.service.impl.TeacherServiceImpl;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static StudentServiceImpl studentService = new StudentServiceImpl();
    static TeacherServiceImpl teacherService = new TeacherServiceImpl();

    public static void displayMainMenu() {
        do {
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Xóa");
            System.out.println("4.Sắp xếp");
            System.out.println("5.Chỉnh sửa");
            System.out.println("6.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    displays();
                    break;
                case "2":
                    displayAdd();
                    break;
                case "3":
                    displayRemove();
                    break;
                case "4":
                    displaySort();
                    break;
                case "5":
                    displayEdit();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayAdd() {
        do {
            System.out.println("1.Thêm mới sinh viên");
            System.out.println("2.Thêm mới giáo viên");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.add();
                    break;
                case "2":
                    teacherService.add();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displays() {
        do {
            System.out.println("1.Hiển thị danh sách sinh viên ");
            System.out.println("2.Hiển thị danh sách giáo viên");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.display();
                    break;
                case "2":
                    teacherService.display();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayRemove() {
        do {
            System.out.println("1.Xóa sinh viên");
            System.out.println("2.Xóa giáo viên");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.remove();
                    break;
                case "2":
                    teacherService.remove();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displaySort() {
        do {
            System.out.println("1.Sắp xếp sinh viên ");
            System.out.println("2.Sắp xếp giáo viên");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    displaySortStudent();
                    break;
                case "2":
                    displaySortTeacher();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayEdit() {
        do {
            System.out.println("1.Thay dổi sinh viên");
            System.out.println("2.Thay đổi giáo viên");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.edit();
                    break;
                case "2":
                    teacherService.edit();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displaySortStudent() {
        do {
            System.out.println("1.Sắp xếp theo tên");
            System.out.println("2.Sắp xếp theo ngày sinh");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentService.sortName();
                    break;
                case "2":
                    teacherService.sortDateOfBirth();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displaySortTeacher() {
        do {
            System.out.println("1.Sắp xếp theo tên");
            System.out.println("2.Sắp xếp theo ngày sinh");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    teacherService.sortName();
                    break;
                case "2":
                    teacherService.sortDateOfBirth();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

}
