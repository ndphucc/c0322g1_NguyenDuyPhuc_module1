package ss19_String_regex.bai_tap.validate_sdt;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String validName = "(84)-(0978489648)";
        String invalidName = "(a8)-(22222222)";
        System.out.println(validate(validName));
        System.out.println(validate(invalidName));

    }

    public static boolean validate(String regex) {
        String validate_regex = "^[(]\\d{2}[)][-][(]0\\d{9}[)]$";
        return Pattern.matches(validate_regex, regex);
    }
}
