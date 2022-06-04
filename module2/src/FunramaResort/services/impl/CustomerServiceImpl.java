package FunramaResort.services.impl;

import FunramaResort.model.Customer;
import FunramaResort.services.CustomerService;
import FunramaResort.utils.GetUntils;
import FunramaResort.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static Scanner scanner = new Scanner(System.in);
    static String CUSTOMER_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\customer.csv";
    static List<Customer> customerList = new LinkedList<>();

    @Override
    public void display() {
        readFile();
        for (Customer item : customerList
        ) {
            System.out.println(item);

        }
    }

    public String getLevel() {
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
                getLevel();

        }
        return "";
    }

    @Override
    public void add() {
        readFile();

        System.out.println("Nhập tên");
        String name = scanner.nextLine();

        String id = "" + (Integer.parseInt(customerList.get(customerList.size() - 1).getId()) + 1);

        String dateOfBirth = GetUntils.getDateOfBirth();

        String gender = GetUntils.getGender();

        System.out.println("Nhập số cccd");
        String citizenldentification = scanner.nextLine();

        System.out.println("Nhập sdt");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập email");
        String email = scanner.nextLine();

        String customerLevel = getLevel();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        customerList.add(new Customer(id, name, dateOfBirth, gender, citizenldentification, phoneNumber, email, customerLevel, address));
        writeFile();
    }

    @Override
    public void edit() {
        readFile();

        System.out.println("Chọn id bạn muốn sửa");
        String id = (scanner.nextLine());

        for (Customer item : customerList) {
            if (item.getId().equals(id)) {

                System.out.println("Nhập tên");
                String name = scanner.nextLine();

                String dateOfBirth = GetUntils.getDateOfBirth();

                String gender = GetUntils.getGender();

                System.out.println("Nhập số cccd");
                String citizenldentification = scanner.nextLine();

                System.out.println("Nhập sdt");
                String phoneNumber = scanner.nextLine();

                System.out.println("Nhập email");
                String email = scanner.nextLine();

                String customerLevel = getLevel();

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

                writeFile();
                return;
            }
        }
        System.out.println("id không tồn tại");
    }

    public static void readFile() {
        List<String[]> strings = ReadAndWriteFile.readFile(CUSTOMER_PATH);
        customerList.clear();
        for (String[] item : strings) {
            customerList.add(new Customer(item[0], item[1], item[2], item[3], item[4], item[5], item[6], item[7], item[8]));
        }
    }

    public static void writeFile() {
        ReadAndWriteFile.clearFile(CUSTOMER_PATH);
        for (Customer item : customerList) {
            String line = item.getId() + ","
                    + item.getName() + ","
                    + item.getDateOfBirth() + ","
                    + item.getGender() + ","
                    + item.getCitizenIdentification() + ","
                    + item.getPhoneNumber() + ","
                    + item.getEmail() + ","
                    + item.getCustomerLevel() + ","
                    + item.getAddress();
            ReadAndWriteFile.writeFile(CUSTOMER_PATH, line);
        }
    }

}
