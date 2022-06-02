package FunramaResort.services.impl;

import FunramaResort.libs.UserException;
import FunramaResort.model.Employee;
import FunramaResort.services.EmployeeService;
import FunramaResort.utils.GetTime;
import FunramaResort.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner sc = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();
    static String EMPLOYEE_PATH = "D:\\codegym\\c0322g1_nguyenduyphuc\\module2\\src\\FunramaResort\\data\\employee.csv";

    @Override
    public void display() {
        readFile();
        for (Employee item : employeeList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    private void readFile() {
        List<String[]> strings = ReadAndWriteFile.readFile(EMPLOYEE_PATH);
        employeeList.clear();
        for (String[] item : strings) {
            employeeList.add(new Employee(item[0], item[1], item[2], item[3], item[4], item[5], item[6], item[7], item[8], Double.parseDouble(item[9])));

        }
    }

    public void writeFile() {
        ReadAndWriteFile.clearFile(EMPLOYEE_PATH);
        for (Employee item : employeeList) {
            String line = item.getId() + ","
                    + item.getName() + ","
                    + item.getDateOfBirth() + ","
                    + item.getGender() + ","
                    + item.getCitizenIdentification() + ","
                    + item.getPhoneNumber() + ","
                    + item.getEmail() + ","
                    + item.getLevel() + ","
                    + item.getPosition() + ","
                    + item.getSalary();
            ReadAndWriteFile.writeFile(EMPLOYEE_PATH, line);
        }
    }

    @Override
    public void addNew() {
        readFile();
        System.out.println("Nhập tên");
        String name = sc.nextLine();
        String id = "" + (Integer.parseInt(employeeList.get(employeeList.size() - 1).getId()) + 1);
        String dateOfBirth = GetTime.getDateOfBirth();
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
        String temp = sc.nextLine();
        double salary = UserException.numberFormatExceptionDouble(temp);
        employeeList.add(new Employee(id, name, dateOfBirth, gender, citizenldentification, phoneNumber, email, position, level, salary));
        writeFile();
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
            }
        } while (true);
    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Chọn id bạn muốn sửa");
        String id = (sc.nextLine());
        for (Employee item : employeeList) {
            if (item.getId().equals(id)) {
                System.out.println("Nhập tên");
                String name = sc.nextLine();
                String dateOfBirth = GetTime.getDateOfBirth();
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
                ReadAndWriteFile.clearFile(EMPLOYEE_PATH);
                writeFile();
                return;
            }
        }
        System.out.println("id không tồn tại");
        edit();
    }

}
