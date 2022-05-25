package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu mang");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrNum = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i);
            arrNum[i] = Integer.parseInt(scanner.nextLine());
        }
        insertSort(arrNum);

    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            for (; j >= 0 && key < arr[j]; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = key;
        }
        System.out.println(Arrays.toString(arr));

    }
}
