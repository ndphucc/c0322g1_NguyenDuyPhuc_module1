package CRUD.bai_tap_nho_2.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_DATE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|" +
            "[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$" +
            " ^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static final String REGEX_STUDENT_ID= "[0-9]{8}";

    public static boolean regexDate(String date) {
        return Pattern.matches(REGEX_DATE, date);
    }

    public static boolean regexBirthDay(String date) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate temp = LocalDate.parse(date, formatter);
        return !now.plusYears(-18).isBefore(temp) && !now.plusYears(-100).isAfter(temp);
    }

    public static boolean regex(String str) {
        return !str.equals("");
    }
    public static boolean regexStudentId(String str) {
        return Pattern.matches(REGEX_STUDENT_ID,str);
    }
}
