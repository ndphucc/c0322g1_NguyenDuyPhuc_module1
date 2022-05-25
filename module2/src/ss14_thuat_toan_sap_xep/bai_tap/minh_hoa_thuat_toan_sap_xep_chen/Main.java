package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 71, 12, 2};
        insertSort(arr);

    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && key < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }

    }
}
