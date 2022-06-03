package CRUD.thi_thu.controllers;

import java.util.Scanner;

public class Controllers {
    static Scanner scanner = new Scanner(System.in);

    public static void controllers() {
        do {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.Thêm mới giảng viên hoặc học sinh");
            System.out.println("2.Xóa giảng viên hoặc học sinh");
            System.out.println("3.Xem danh sách giảng viên hoặc học sinh");
            System.out.println("4.Tìm kiếm giảng viên hoặc học sinh");
            System.out.println("5.Thoát");
            System.out.println("Chọn chức năng:");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    displayAdd();
                    break;
                case "2":
                    displayRemove();
                    break;
                case "3":
                    displayList();
                    break;
                case "4":
                    displayFind();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ hãy nhập số từ 1-5");
            }
        } while (true);
    }

    public static void displayAdd() {
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.Thêm mới giảng viên");
            System.out.println("2.Thêm mới học sinh");
            System.out.println("3.Quay lại");
            System.out.println("Chọn chức năng:");
        } while (true);
    }

    public static void displayRemove() {
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.Xóa giảng viên");
            System.out.println("2.Xóa học sinh");
            System.out.println("3.Quay lại");
            System.out.println("Chọn chức năng:");
        } while (true);

    }

    public static void displayList() {
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.Xem danh sách giảng viên");
            System.out.println("2.Xem danh sách học sinh");
            System.out.println("3.Quay lại");
            System.out.println("Chọn chức năng:");
        } while (true);

    }

    public static void displayFind() {
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1.Tìm kiếm giảng viên");
            System.out.println("2.Tìm kiếm học sinh");
            System.out.println("3.Quay lại");
            System.out.println("Chọn chức năng:");
        } while (true);

    }
}
