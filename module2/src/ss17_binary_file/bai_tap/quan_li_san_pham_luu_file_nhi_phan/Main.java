package ss17_binary_file.bai_tap.quan_li_san_pham_luu_file_nhi_phan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("---QUẢN LÝ SẢN PHẨM---");
            System.out.println("1.Thêm mới sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4.Thoát khỏi chương trình");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Service.addNew();
                    break;
                case 2:
                    Service.displays();
                    break;
                case 3:
                    Service.search();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!!");
            }
        } while (true);
    }
}
