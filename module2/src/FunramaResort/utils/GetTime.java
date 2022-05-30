package FunramaResort.utils;

public class GetTime {
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
}
