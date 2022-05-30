package casestudy.service.Impl;

import casestudy.models.preson.Customer;
import casestudy.service.CustomerService;
import casestudy.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy\\data\\customer.csv");
        customerList.clear();
        for (String[] item : listStr) {
            if (item.length != 1) {
                Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], Boolean.parseBoolean(item[3]),
                        Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8]);
                customerList.add(customer);
            }
        }
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    public String getCustomerType() {
        do {
            System.out.println("Chọn loại khách hàng");
            System.out.println("1.Diamond");
            System.out.println("2.Platinium");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Bạn chọn lại nha!! Sai rồi");
                    getCustomerType();
            }
        } while (true);
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        String age = scanner.nextLine();
        System.out.println("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập CMND: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập SĐT: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mail: ");
        String mail = scanner.nextLine();
        String customerType = getCustomerType();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        //readFile();
        Customer customer = new Customer(id, name, age, gender, identityCard, phoneNumber, mail, customerType, address);
        // customerList.add(customer);
        String line = customer.getId() + "," + customer.getName() + "," + customer.getAge() + "," + customer.isGender() + "," + customer.getIdentityCard() + "," +
                customer.getPhoneNumber() + "," + customer.getMail() + "," + customer.getAddress();
        ReadAndWrite.writeFile("src\\casestudy\\data\\customer.csv", line);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập vị trí mình muốn sửa: ");
        int inputEdit = Integer.parseInt(scanner.nextLine());
        for (Customer customer : customerList) {
            if (customer.getId() == inputEdit) {
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                String age = scanner.nextLine();
                System.out.println("Nhập giới tính: ");
                boolean gender = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Nhập CMND: ");
                int identityCard = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập SĐT: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập mail: ");
                String mail = scanner.nextLine();
                String customerType = getCustomerType();
                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                customer.setName(name);
                customer.setAge(age);
                customer.setGender(gender);
                customer.setIdentityCard(identityCard);
                customer.setPhoneNumber(phoneNumber);
                customer.setMail(mail);
                customer.setCustomerType(customerType);
                customer.setAddress(address);
                System.out.println(customerList);
            }
        }
    }

//    public void readFile() {
//        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy.data\\customer.csv");
//        customerList.clear();
//        for (String[] item : listStr) {
//            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], Integer.parseInt(item[2]), Boolean.parseBoolean(item[3]),
//                    Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8]);
//            customerList.add(customer);
//        }
//    }
//
//    public void writeFile() {
//        for (Customer customer : customerList) {
//            String line = customer.getId() + "," + customer.getName() + "," + customer.getAge() + "," + customer.isGender() + "," + customer.getIdentityCard() + "," +
//                    customer.getPhoneNumber() + "," + customer.getMail() + customer.getAddress();
//            ReadAndWrite.writeFile("src\\casestudy.data\\customer.csv", line);
//        }
//    }
}
