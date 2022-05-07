package ss3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số cột của mảng");
        int col = Integer.parseInt(scanner.nextLine());
        double arr[][] = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Nhập phần tử ["+i+"]["+j+"]");
                arr[i][j]=Double.parseDouble(scanner.nextLine());
            }
        }
        double sum =0.0;
        System.out.println("Nhập số cột muốn tính tổng");
        int value = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < row; i++) {
           sum+=arr[i][value];
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("tổng của cột "+value+" = "+sum);
    }
}
