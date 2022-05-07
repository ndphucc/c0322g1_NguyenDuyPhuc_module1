package ss3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số hàng của mảng");
        int colum = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print("nhập phần tử ["+i+"]["+j+"]");
                arr[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int max= arr[0][0];
        int x=0;
        int y=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                if(max<arr[i][j]) {
                    max=arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("max = "+max+"ở vị trí["+x+"]["+y+"]");
    }
}
