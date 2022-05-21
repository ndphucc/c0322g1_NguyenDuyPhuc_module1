package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_java_collection_framework;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        do {
            System.out.println("Chọn 1 số");
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa sản phẩm ");
            System.out.println("3.Xóa sản phẩm ");
            System.out.println("4.Hiện thị danh sách");
            System.out.println("5.Tìm kiếm sản phẩm");
            System.out.println("6 Sắp xếp sản phẩm");
            System.out.println("7.Thoát");
            Scanner scanner = new Scanner(System.in);
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.updateProduct();
                    break;
                case 3:
                    productManager.removeProduct();
                    break;
                case 4:
                    productManager.displayProducts();
                    break;
                case 5:
                    productManager.findProduct();
                    break;
                case 6:
                    productManager.sortProductList();
                    break;
                case 7:
                    System.exit(1);
            }
        }while (true);
    }
}
