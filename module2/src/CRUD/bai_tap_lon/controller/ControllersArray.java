package CRUD.bai_tap_lon.controller;

import CRUD.bai_tap_lon.service.LinkedListNhanVien;
import CRUD.bai_tap_lon.service.MapNhanVien;

import java.util.Scanner;

public class ControllersArray {
    static Scanner scanner = new Scanner(System.in);

    public static void controllers() {
        LinkedListNhanVien listNhanVien = new LinkedListNhanVien();
        MapNhanVien mapNhanVien = new MapNhanVien();
        do {
            System.out.println("1.hiển thị danh sách");
            System.out.println("2.sắp xếp theo tên");
            System.out.println("3.sắp xếp theo lương");
            System.out.println("4.săp xếp theo tên và lương");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    listNhanVien.display();
                    break;
                case 2:
                    listNhanVien.sapXepTheoTen();
                    listNhanVien.display();
                    break;
                case 3:
                    listNhanVien.sapXepTheoLuong();
                    listNhanVien.display();
                    break;
                case 4:
                    listNhanVien.sapXepTheoTenVaLuong();
                    listNhanVien.display();
                    break;
                case 5:
                    System.exit(1);
            }
        } while (true);
    }
}
