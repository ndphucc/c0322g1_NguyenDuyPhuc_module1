package FunramaResort.libs;

import java.util.Scanner;

public class UserException {
    static Scanner scanner = new Scanner(System.in);

    public static double parseDouble(String str) {
        double result = 0;
        boolean flag = true;
        do {
            try {
                result = Double.parseDouble(str);
                flag = false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage() + "Sai định dạng nhập lại đi");
                str = scanner.nextLine();
            }
        } while (flag);
        return result;
    }

    public static int parseInteger(String str) {
        int result = 0;
        boolean flag = true;
        do {
            try {
                result = Integer.parseInt(str);
                flag = false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage() + "Sai định dạng nhập lại đi");
                str = scanner.nextLine();
            }
        } while (flag);
        return result;
    }
}
