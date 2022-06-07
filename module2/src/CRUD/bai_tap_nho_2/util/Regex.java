package CRUD.bai_tap_nho_2.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_STUDENT_ID = "[0-9]{8}";

    public static boolean regexDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate localDate = LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String date = "32/08/2016";

        //convert String to LocalDate
        try {
            LocalDate localDate = LocalDate.parse(date, formatter);
        } catch (
                DateTimeParseException e) {
            System.out.println("Sai định dạng");
        }

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
        return Pattern.matches(REGEX_STUDENT_ID, str);
    }
}
