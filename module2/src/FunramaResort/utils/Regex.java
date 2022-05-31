package FunramaResort.utils;

import java.util.regex.Pattern;

public class Regex {
    public static boolean regexVillaId(String bookingId) {
        String regexBookingId = "^[SVVL]+[-]+[0-9]{4}";
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
        String regex = "^[A-Z]+\\w+";
        return Pattern.matches(regex, name);
    }

}
