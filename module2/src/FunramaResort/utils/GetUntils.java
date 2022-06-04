package FunramaResort.utils;

import java.util.Scanner;

public class GetUntils {
    static Scanner scanner = new Scanner(System.in);

    public static String getYearBooking(String starDay) {
        String[] strings = starDay.split("/");
        return strings[2];
    }

    public static String getMonthBooking(String starDay) {
        String[] strings = starDay.split("/");
        return strings[1];
    }

    public static String getMonthDateTime() {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        String[] strings = date.toString().split("-");
        return strings[1];
    }

    public static String getDateOfBirth() {
        do {
            System.out.println("Nhập ngày sinh");
            String str = scanner.nextLine();
            if (Regex.regexDate(str)) {
                if (Regex.regexBirthDay(str)) {
                    return str;
                } else {
                    System.out.println("Ngày sinh không hợp lệ");
                }
            } else {
                System.out.println("Nhập sai định dạng");
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
                    System.out.println("Vui lòng chọn 1 hoặc 2");
            }
        } while (true);

    }

}
