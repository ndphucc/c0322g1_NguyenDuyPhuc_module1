package giai_thuat_nhom;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class GiaiThuatNhom {
    public static String solution(String s) {
        s = s.trim();
        String[] temp = s.split("");
        String str = "";
        for (int i = 0; i < temp.length; i++) {
            if (temp[i].compareTo("a") < 0) {
                if (i == 0) {
                    str += temp[i].toLowerCase();
                    continue;
                }
                str += " ";
                str += temp[i].toLowerCase();

            } else {
                str += temp[i];
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "  ABCFDDD";
        System.out.println(solution(str));
    }
}
