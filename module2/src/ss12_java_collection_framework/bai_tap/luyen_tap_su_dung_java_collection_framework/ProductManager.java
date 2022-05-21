package ss12_java_collection_framework.bai_tap.luyen_tap_su_dung_java_collection_framework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager  {
    public static LinkedList<Product> productList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        productList.add(new Product(1, "Gạo", 12000));
        productList.add(new Product(2, "Mắm", 5000));
        productList.add(new Product(3, "Muối", 16000));
        productList.add(new Product(4, "Đường", 17000));
        productList.add(new Product(5, "Sữa", 12000));
    }

    public void displayProducts() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public boolean checkId(int id) {
        for (Product item : productList) {
            if (item.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public void addProduct() {
        int id = Integer.parseInt(scanner.nextLine());
        String productName = scanner.nextLine();
        Double productPrice = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, productName, productPrice);
        productList.add(product);
    }

    public void updateProduct() {
        System.out.println("Nhap id muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id)) {
            for (Product item : productList) {
                if (item.getId() == id) {
                    System.out.println("Nhập tên");
                    String productName = scanner.nextLine();
                    System.out.println("Nhập giá");
                    double productPrime = Double.parseDouble(scanner.nextLine());
                    item.setName(productName);
                    item.setPrice(productPrime);
                    System.out.println("Đã sữa thành công");
                    return;
                }
            }
        } else {
            System.out.println("Id ko tồn tại");
        }
    }

    public void removeProduct() {
        System.out.println("Nhập id bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id)) {
            for (Product item : productList) {
                if (item.getId() == id) {
                    productList.remove(item);
                    System.out.println("Bạn đã xóa thành công");
                    return;
                }
            }
        } else {
            System.out.println("Id không tồn tại");
        }
    }
    public void sortProductList() {
        Collections.sort(productList);
        displayProducts();
    }
    public void findProduct() {
        System.out.println("Nhập tên bạn muốn tìm");
        String find = scanner.nextLine();
        boolean flag=false;
        for (Product item: productList) {
            if (item.getName().contains(find)) {
                System.out.println(item);
                flag=true;
            }
        }
        if (flag==false) {
            System.out.println("Không tìm thấy");
        }
    }


}
