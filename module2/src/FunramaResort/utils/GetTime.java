package FunramaResort.utils;

import java.util.Scanner;

public class GetTime {
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

}
