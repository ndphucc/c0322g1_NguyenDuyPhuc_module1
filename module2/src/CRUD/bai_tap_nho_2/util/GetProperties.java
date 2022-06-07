package CRUD.bai_tap_nho_2.util;

import CRUD.bai_tap_nho_2.model.Student;
import CRUD.bai_tap_nho_2.service.impl.StudentServiceImpl;

import java.util.Scanner;

public class GetProperties {
    static Scanner scanner = new Scanner(System.in);

    public static String getId() {
        do {
            boolean flag = false;
            System.out.println("Nhập id");
            String id = scanner.nextLine();
            for (Student student : StudentServiceImpl.studentList) {
                if (id.equals(student.getId())) {
                    System.out.println("id đã tồn tại");
                    flag = true;
                }
            }
            if (!flag) {
                return id;
            }
        } while (true);
    }

    public static String getName() {
        do {
            System.out.println("Nhập tên");
            String result = scanner.nextLine();
            if (Regex.regex(result)) {
                return result;
            } else {
                System.out.println("Hãy nhập tên vào");
            }
        } while (true);
    }

    public static String getGender() {
        do {
            System.out.println("Chọn giới tính");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    return "Nam";
                case "2":
                    return "Nữ";
                default:
                    System.out.println("Chọn 1 hoặc 2");
            }
        } while (true);
    }

    public static String getDateOfBirth() {
        do {
            System.out.println("Nhập ngày sinh");
            String dateOfBirth = scanner.nextLine();
            if (Regex.regexDate(dateOfBirth)) {
                if (Regex.regexBirthDay(dateOfBirth)) {
                    return dateOfBirth;
                } else {
                    System.out.println("Ngày sinh phải lớn hơn 18 tuổi");
                }
            } else {
                System.out.println("Nhập đúng định dạng dd/MM/yyyy");
            }
        } while (true);
    }

    public static String getAddress() {
        do {
            System.out.println("Nhập địa chỉ");
            String result = scanner.nextLine();
            if (Regex.regex(result)) {
                return result;
            } else {
                System.out.println("Hãy nhập địa chỉ vào vào");
            }
        } while (true);
    }

    public static String getStudentId() {
        do {
            System.out.println("Nhập id");
            String result = scanner.nextLine();
            if (Regex.regexStudentId(result)) {
                boolean flag = false;
                for (Student student : StudentServiceImpl.studentList) {
                    if (student.getStudentId().equals(result)) {
                        flag = true;
                        System.out.println("id đã tồn tại");
                        break;
                    }
                }
                if (!flag) {
                    return result;
                }
            }
        } while (true);

    }

    public static Double getAveragePoint() {
        do {
            System.out.println("Nhập điểm trung bình");
            String averagePoint = scanner.nextLine();
            if (parseDouble(averagePoint) < 0 || parseDouble(averagePoint) > 10) {
                System.out.println("vui lòng nhập từ 0-10");
            } else {
                return parseDouble(averagePoint);
            }
        } while (true);

    }

    public static double getSalary() {
        do {
            System.out.println("Nhập lương");
            String averagePoint = scanner.nextLine();
            if (parseDouble(averagePoint) < 0) {
                System.out.println("vui lòng nhập số dương");
            } else {
                return parseDouble(averagePoint);
            }
        } while (true);
    }

    public static double getTimeNumber() {
        do {
            System.out.println("Nhập số giờ làm");
            String averagePoint = scanner.nextLine();
            if (parseDouble(averagePoint) < 0) {
                System.out.println("vui lòng nhập số dương");
            } else {
                return parseDouble(averagePoint);
            }
        } while (true);
    }

    public static double parseDouble(String str) {
        double result = 0;
        boolean flag = true;
        do {
            try {
                result = Double.parseDouble(str);
                flag = false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage() + "Hãy nhập số ");
                str = scanner.nextLine();
            }
        } while (flag);
        return result;
    }


}
