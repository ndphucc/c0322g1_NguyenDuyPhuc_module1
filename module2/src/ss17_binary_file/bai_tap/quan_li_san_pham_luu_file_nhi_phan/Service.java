package ss17_binary_file.bai_tap.quan_li_san_pham_luu_file_nhi_phan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    private static Scanner scanner = new Scanner(System.in);
    static List<Product> productFileList = new ArrayList<>();

    public static void displays() {
        productFileList = ReadAndWriteFile.readDataFromFile("D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss17_binary_file\\bai_tap\\quan_li_san_pham_luu_file_nhi_phan\\product.csv");
        for (Product item : productFileList) {
            System.out.println(item);
        }
    }

    public static void addNew() {
        System.out.println("Nhập mã của sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        Double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, production, price);
        productFileList.add(product);
        ReadAndWriteFile.writeToFile("D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss17_binary_file\\bai_tap\\quan_li_san_pham_luu_file_nhi_phan\\product.csv", productFileList);
    }

    public static void search() {
        System.out.println("Nhập tên sản phẩm muốn tìm kiếm: ");
        String inputName = scanner.nextLine();
        ReadAndWriteFile.readDataFromFile("D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\ss17_binary_file\\bai_tap\\quan_li_san_pham_luu_file_nhi_phan\\product.csv");
        for (Product item : productFileList) {
            if (item.getNameProduct().contains(inputName)) {
                System.out.println("Thông tin sản phẩm cần tìm: " + item);
                return;
            }
        }
        System.out.println("Sản phẩm không có trong danh sách");
    }
}
