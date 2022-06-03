package CRUD.thi_thu.util;

import java.util.regex.Pattern;

public class Regex {
    private static final String REGEX_STUDENT_ID = "^(SV-)[0-9]{4}";
    private static final String REGEX_TEACHER_ID = "^(GV-)[0-9]{4}";
    private static final String REGEX_GENDER = "(Nam||Nữ||khác)";
    private static final String REGEX_TIME = "^([0-2][0-9]|3[0-1])/(0[0-9]|1[0-2])/[0-9]{4}$";

    public static boolean regexStudentId(String str) {
        return Pattern.matches(REGEX_STUDENT_ID,str);
    }
    public static boolean regexTeacherId(String str) {
        return Pattern.matches(REGEX_TEACHER_ID,str);
    }
    public static boolean regexGender(String str) {
        return Pattern.matches(REGEX_GENDER,str);
    }
    public static boolean regexTime(String str) {
        return Pattern.matches(REGEX_TIME,str);
    }

}
