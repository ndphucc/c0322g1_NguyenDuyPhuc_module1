package tai_khoan_ngan_hang.controller;

import tai_khoan_ngan_hang.service.Impl.BankAccountServiceImpl;

import java.util.Scanner;

public class BankAccountManagement {
    public static void menu() {
        BankAccountServiceImpl bankAccountService = new BankAccountServiceImpl();
        do {
            int choose = 0;
            boolean check = true;
            while (check) {
                System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG");
                System.out.println("1. Thêm mới tài khoản");
                System.out.println("2. Xóa tài khoản");
                System.out.println("3. Xem danh sách tài khoản");
                System.out.println("4. Tìm kiếm tài khoản");
                System.out.println("5. Thoát");
                System.out.println("Enter your choice: ");
                Scanner scanner = new Scanner(System.in);
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai, vui lòng nhập lại đi!!");
                }
                switch (choose) {
                    case 1:
                        add();
                        break;
                    case 2:
                        bankAccountService.delete();
                        break;
                    case 3:
                        bankAccountService.display();
                        break;
                    case 4:
                        bankAccountService.search();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("Không có chức năng này!! Bạn chọn lại đi!!!");
                }
            }
        } while (true);
    }

    public static void add() {
        BankAccountServiceImpl bankAccountService = new BankAccountServiceImpl();
        boolean check = true;
        int choose = 0;
        while (check) {
            System.out.println("1. Thêm mới tài khoản tiết kiệm");
            System.out.println("2. Thêm mới tài khoản thanh toán");
            System.out.println("3. Quay lại menu chính");
            Scanner scanner = new Scanner(System.in);
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai. Vui lòng nhập lại đi!!");
            }
            switch (choose) {
                case 1:
                    bankAccountService.addSavingAccount();
                    break;
                case 2:
                    bankAccountService.addPayAccount();
                    break;
                case 3:
                    menu();
                default:
                    System.out.println("Không có chức năng này!! Bạn chọn lại đi");
            }
        }
    }
}

