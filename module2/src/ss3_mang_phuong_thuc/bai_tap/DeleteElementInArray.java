package ss3_mang_phuong_thuc.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int lengthArray=input.nextInt();
        int arrNumber[] = new int[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Nhâp phần tử thứ "+(i+1));
            arrNumber[i]=input.nextInt();
        }
        System.out.println("Nhập số cần xóa");
        int x=input.nextInt();
        System.out.println("Mảng ban đầu:"+Arrays.toString(arrNumber));
        for (int i = 0; i < arrNumber.length; i++) {
            if(x==arrNumber[i]) {
               removeElementInArray(i,arrNumber);
               i--;
            }
        }
        System.out.println("Mảng sau khi xóa:"+Arrays.toString(arrNumber));

    }
    public static void removeElementInArray(int index, int arr[]) {
        for (int i = index; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
    }
}
