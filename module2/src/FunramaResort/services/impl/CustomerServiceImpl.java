package FunramaResort.services.impl;

import FunramaResort.model.Customer;
import FunramaResort.model.Employee;
import FunramaResort.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    static {
        customerList.add(new Customer(1, "Lê Văn Luyện", "4/2/01", "Nam", "040276545", "0876454245", "ght@gmail.com", "Diamond", "Huế"));
        customerList.add(new Customer(2, "Lê Văn B", "4/1/03", "Nam", "040276545", "0876454245", "ght@gmail.com", "Palatinium", "Huế"));
        customerList.add(new Customer(3, "Lê Văn L", "4/1/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Gold", "Huế"));
        customerList.add(new Customer(4, "Lê Văn C", "4/2/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Member", "Huế"));
        customerList.add(new Customer(5, "Trần Văn A", "4/8/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Diamond", "Huế"));
    }

    @Override
    public void display() {
        for (Customer item : customerList
        ) {
            System.out.println(item);

        }
    }

    public String getCustomerLevel() {
        System.out.println("Hãy chọn loại khách hàng");
        System.out.println("1.Diamond");
        System.out.println("2.Platinum");
        System.out.println("3.Gold");
        System.out.println("4.Silver");
        System.out.println("5.Member");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                return "Diamond";
            case 2:
                return "Platinum";
            case 3:
                return "Gold";
            case 4:
                return "Silver";
            case 5:
                return "Member";
            default:
                System.out.println("Lựa chọn không hợp lệ");
                getCustomerLevel();

        }
        return "";
    }

    @Override
    public void addNew() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        int id = customerList.get(customerList.size() - 1).getId() + 1;
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập số cccd");
        String citizenldentification = scanner.nextLine();
        System.out.println("Nhập sdt");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập email");
        String email = scanner.nextLine();
        String customerLevel = getCustomerLevel();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        customerList.add(new Customer(id, name, dateOfBirth, gender, citizenldentification, phoneNumber, email, customerLevel, address));

    }

    @Override
    public void edit() {
        System.out.println("Chọn id bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        for (Customer item : customerList) {
            if (item.getId() == id) {
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = scanner.nextLine();
                System.out.println("Nhập giới tính");
                String gender = scanner.nextLine();
                System.out.println("Nhập số cccd");
                String citizenldentification = scanner.nextLine();
                System.out.println("Nhập sdt");
                String phoneNumber = scanner.nextLine();
                System.out.println("Nhập email");
                String email = scanner.nextLine();
                String customerLevel = getCustomerLevel();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                item.setName(name);
                item.setDateOfBirth(dateOfBirth);
                item.setGender(gender);
                item.setCitizenIdentification(citizenldentification);
                item.setPhoneNumber(phoneNumber);
                item.setEmail(email);
                item.setCustomerLevel(customerLevel);
                item.setAddress(address);
                return;
            }
        }
        System.out.println("id không tồn tại");
    }

    @Override
    public void remove() {

    }
}
