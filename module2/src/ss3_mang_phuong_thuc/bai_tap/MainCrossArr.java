package ss3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MainCrossArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng và hàng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("nhập phần tử ["+i+"]["+j+"]");
                arr[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i==j) {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo chính = "+sum);
    }
}
