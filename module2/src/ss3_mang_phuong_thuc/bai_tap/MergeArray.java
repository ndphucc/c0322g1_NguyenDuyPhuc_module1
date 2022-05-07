package ss3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng 1");
        int lengthArray1=input.nextInt();
        int[] arrNumber1 = new int[lengthArray1];
        for (int i = 0; i < lengthArray1; i++) {
            System.out.println("Nhâp phần tử thứ "+(i+1));
            arrNumber1[i]=input.nextInt();
        }
        System.out.println("Nhập độ dài của mảng 2");
        int lengthArray2=input.nextInt();
        int[] arrNumber2 = new int[lengthArray2];
        for (int i = 0; i < lengthArray2; i++) {
            System.out.println("Nhâp phần tử thứ "+(i+1));
            arrNumber2[i]=input.nextInt();
        }
        int arr3[]=new int[lengthArray1+lengthArray2];
        for (int i = 0; i < arr3.length; i++) {
            if(i<arrNumber1.length) {
                arr3[i]=arrNumber1[i];
            }else {
                arr3[i]=arrNumber2[i-arrNumber1.length];
            }
        }
        System.out.println(Arrays.toString(arrNumber1));
        System.out.println(Arrays.toString(arrNumber2));
        System.out.println(Arrays.toString(arr3));
    }
}
