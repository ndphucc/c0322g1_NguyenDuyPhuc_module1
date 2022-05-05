package s1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class CurrencyConvert {
    private static final int rate = 23000;

    public static void main(String[] args) {
        System.out.println("Nhập số tiền USD");
        Scanner scanner = new Scanner(System.in);
        float USD = Float.parseFloat(scanner.nextLine());
        float VND=USD*rate;
        System.out.println(VND);
    }
}
