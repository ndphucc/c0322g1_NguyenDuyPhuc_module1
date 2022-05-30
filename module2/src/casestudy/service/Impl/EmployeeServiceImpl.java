package casestudy.service.Impl;

import casestudy.models.preson.Employee;
import casestudy.service.EmployeeService;
import casestudy.utils.ReadAndWrite;
import casestudy.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String REGEX_BIRTHDAY = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    public String getLocation() {
        do {
            System.out.println("Chọn vị trí");
            System.out.println("1. Lễ tân");
            System.out.println("2. Phục vụ");
            System.out.println("3. Chuyên viên");
            System.out.println("4. Giám sát");
            System.out.println("5. Quản lý");
            System.out.println("6. Giám đốc");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Lễ tân";
                case 2:
                    return "Phục vụ";
                case 3:
                    return "Chuyên viên";
                case 4:
                    return "Giám sát";
                case 5:
                    return "Quản lý";
                case 6:
                    return "Giám đốc";
                default:
                    System.out.println("Chọn lại đi!! Chọn sai rồi");
                    getLocation();
            }

        } while (true);
    }

    public String getLevel() {
        do {
            System.out.println("Chọn trình độ");
            System.out.println("1. Trung cấp");
            System.out.println("2. Cao đẳng");
            System.out.println("3. Đại học");
            System.out.println("4. Sau đại học");
            int choose = Integer.parseInt(scanner.nextLine());
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
                    System.out.println("Chọn sai rồi!! Chọn lại đi");
                    getLevel();
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
        String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);
        System.out.println("Nhập giới tính: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập CMND: ");
        int identityCard = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập SĐT: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mail: ");
        String mail = scanner.nextLine();
        String level = getLevel();
        String location = getLocation();
        System.out.println("Nhập lương");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, age, gender, identityCard, phoneNumber, mail, level, location, salary);
        String line = employee.getId() + "," + employee.getName() + "," + employee.getAge() + "," + employee.isGender() + "," + employee.getIdentityCard() + "," +
                employee.getPhoneNumber() + "," + employee.getMail() + "," + employee.getLevel() + "," + employee.getLocation() + "," + employee.getSalary();
        ReadAndWrite.writeFile("src\\casestudy\\data\\employee.csv", line);
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập vị trí mình muốn sửa: ");
        int inputEdit = Integer.parseInt(scanner.nextLine());
        for (Employee employee : employeeList) {
            if (employee.getId() == inputEdit) {
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
                String level = getLevel();
                String location = getLocation();
                System.out.println("Nhập lương");
                int salary = Integer.parseInt(scanner.nextLine());
                employee.setName(name);
                employee.setAge(age);
                employee.setGender(gender);
                employee.setIdentityCard(identityCard);
                employee.setPhoneNumber(phoneNumber);
                employee.setMail(mail);
                employee.setLevel(level);
                employee.setLocation(location);
                employee.setSalary(salary);
                System.out.println(employeeList);
            }
        }
    }
}