package tai_khoan_ngan_hang.untils;

import java.util.Scanner;

public class Regex {
    static Scanner scanner = new Scanner(System.in);
    public static String number(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidNumberException("Bạn đã nhập sai định dạng. Phải là số dương");
                }

            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }
}
