package CRUD.bai_tap_nho_cong_ty_abc.controller;

import CRUD.bai_tap_nho_cong_ty_abc.services.impl.ServiceImpl;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static ServiceImpl service = new ServiceImpl();

    public static void displayMainMenu() {
        do {
            System.out.println("1.Hiển thị danh sách");
            System.out.println("2.Thêm mới");
            System.out.println("3.Xóa");
            System.out.println("4.Tìm kiếm");
            System.out.println("5.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.display();
                    break;
                case "2":
                    displayAdd();
                    break;
                case "3":
                    service.remove();
                    break;
                case "4":
                    service.find();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void displayAdd() {
        do {
            System.out.println("1.Thêm mới nhân viên quản lí");
            System.out.println("2.Thêm mới nhân viên sản xuất");
            System.out.println("3.Thoát");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    service.addQuanLi();
                    break;
                case "2":
                    service.addSanXuat();
                    break;
                case "3":
                    return;
                default:
                    System.out.println("lựa chọn không hợp lệ");
            }
        } while (true);
    }
}
