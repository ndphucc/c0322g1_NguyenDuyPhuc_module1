package ss19_String_regex.bai_tap.validate;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String validName = "C0318G";
        String invalidName = "M0318G";
        System.out.println(validate(validName));
        System.out.println(validate(invalidName));

    }

    public static boolean validate(String regex) {
        String validate_regex = "^[CAP]\\d{4}[GHIKLM]$";
        return Pattern.matches(validate_regex, regex);
    }
}
