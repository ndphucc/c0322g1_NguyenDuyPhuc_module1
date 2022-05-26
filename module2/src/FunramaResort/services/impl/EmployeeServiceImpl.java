package FunramaResort.services.impl;

import FunramaResort.model.Employee;
import FunramaResort.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner sc = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1,"Nguyễn Duy Phúc", "4/8/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Đại học", "Quản lý", 100000));
        employeeList.add(new Employee(2,"Nguyễn Văn A", "4/2/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Đại học", "Quản lý", 100000));
        employeeList.add(new Employee(3,"Nguyễn Duy B", "4/8/01", "Nam", "040276545", "0876454245", "ght@gmail.com", "Đại học", "Quản lý", 100000));
        employeeList.add(new Employee(4,"Lê Văn C", "2/2/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Đại học", "Phục vụ", 100000));
        employeeList.add(new Employee(5,"Trương N", "25/05/02", "Nam", "040276545", "0876454245", "ght@gmail.com", "Đại học", "Giám đốc", 500000));

    }

    @Override
    public void display() {
        for (Employee item : employeeList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void addNew() {
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        int id = employeeList.get(employeeList.size()-1).getId()+1;
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = sc.nextLine();
        System.out.println("Nhập giới tính");
        String gender = sc.nextLine();
        System.out.println("Nhập số cccd");
        String citizenldentification = sc.nextLine();
        System.out.println("Nhập sdt");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhập email");
        String email = sc.nextLine();
        String position = getPosition();
        String level = getLevel();
        System.out.println("Nhập lương");
        double salary = Double.parseDouble(sc.nextLine());
        employeeList.add(new Employee(id,name, dateOfBirth, gender, citizenldentification, phoneNumber, email, level, position, salary));

    }

    public String getPosition() {
        do {
            System.out.println("Chọn vị trí");
            System.out.println("1.Lễ tân");
            System.out.println("2.Phục vụ");
            System.out.println("3.Chuyên viên");
            System.out.println("4.Giám sát");
            System.out.println("5.Quản lý");
            System.out.println("6.Giám đốc");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    return "Lễ Tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên Viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Hãy chọn 1 số hợp lệ");
                    getPosition();
            }
        } while (true);
    }

    public String getLevel() {
        do {
            System.out.println("Chọn trình độ");
            System.out.println("1.Trung cấp");
            System.out.println("2.Cao đẳng");
            System.out.println("3.Đại học");
            System.out.println("4.Sau đại học");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    return "Trung cấp";
                case 2:
                    return "Cao đẳng";
                case 3:
                    return "Đại học";
                case 4:
                    return "Sau đại học";
                default:
                    System.out.println("Hãy chọn 1 số hợp lệ");
                    getLevel();
            }
        } while (true);
    }

    @Override
    public void edit() {
        System.out.println("Chọn id bạn muốn sửa");
        int id = Integer.parseInt(sc.nextLine());
        for (Employee item: employeeList) {
            if (item.getId()==id) {
                System.out.println("Nhập tên");
                String name = sc.nextLine();
                System.out.println("Nhập ngày sinh");
                String dateOfBirth = sc.nextLine();
                System.out.println("Nhập giới tính");
                String gender = sc.nextLine();
                System.out.println("Nhập số cccd");
                String citizenldentification = sc.nextLine();
                System.out.println("Nhập sdt");
                String phoneNumber = sc.nextLine();
                System.out.println("Nhập email");
                String email = sc.nextLine();
                String position = getPosition();
                String level = getLevel();
                System.out.println("Nhập lương");
                double salary = Double.parseDouble(sc.nextLine());
                item.setName(name);
                item.setDateOfBirth(dateOfBirth);
                item.setGender(gender);
                item.setCitizenIdentification(citizenldentification);
                item.setPhoneNumber(phoneNumber);
                item.setEmail(email);
                item.setPosition(position);
                item.setLevel(level);
                item.setSalary(salary);
                return;
            }
        }
        System.out.println("id không tồn tại");
    }

    @Override
    public void remove() {

    }
}
