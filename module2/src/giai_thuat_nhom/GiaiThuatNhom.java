package giai_thuat_nhom;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class GiaiThuatNhom {
    public static int[] solution(int[] arg1) {
        for (int i = 0; i < arg1.length; i++) {
            for (int j = i + 1; j < arg1.length; j++) {
                if (arg1[i] != -1 && arg1[j] != -1) {
                    if (arg1[i] > arg1[j]) {
                        int temp = arg1[i];
                        arg1[i] = arg1[j];
                        arg1[j] = temp;
                    }
                }
            }
        }
        return arg1;
    }

    public static void main(String[] args) {
        int[] arr ={-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
