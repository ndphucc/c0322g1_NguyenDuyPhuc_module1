package ss3_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int lengthArray=input.nextInt();
        int arrNumber[] = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Nhâp phần tử thứ "+(i+1));
            arrNumber[i]=input.nextInt();
        }
        int min= arrNumber[0];
        for (int i = 0; i < arrNumber.length; i++) {
            if (min>arrNumber[i]) {
                min=arrNumber[i];
            }
        }
        System.out.println("");
        System.out.println("min = "+min);
    }
}
