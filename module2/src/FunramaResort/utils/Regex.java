package FunramaResort.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Regex {

    public static boolean regexVillaId(String bookingId) {
        String regexBookingId = "^(SVVL)+[-]+[0-9]{4}";
        return Pattern.matches(regexBookingId, bookingId);
    }

    public static boolean regexHouseId(String bookingId) {
        String regexBookingId = "^[SVHO]+[-]+[0-9]{4}";
        return Pattern.matches(regexBookingId, bookingId);
    }

    public static boolean regexRoomId(String bookingId) {
        String regexBookingId = "^[SVRO]+[-]+[0-9]{4}";
        return Pattern.matches(regexBookingId, bookingId);
    }

    public static boolean regexServiceName(String name) {
        String regex = "^[A-Z]+[a-z0-9]+";
        return Pattern.matches(regex, name);
    }

    public static boolean regexDate(String date) {
        String regex = "^([0-2][0-9]|3[0-1])/(0[0-9]|1[0-2])/[0-9]{4}$";
        return Pattern.matches(regex, date);
    }

    public static boolean regexBirthDay(String date) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate temp = LocalDate.parse(date, formatter);
        return !now.plusYears(-18).isBefore(temp) && !now.plusYears(-100).isAfter(temp);
    }


}
