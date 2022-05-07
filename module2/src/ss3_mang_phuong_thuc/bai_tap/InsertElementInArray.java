package ss3_mang_phuong_thuc.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrNumber[] = {10,4,6,7,8,0,0,0,0,0};
        System.out.println("Nhập số muốn chèn vào mảng");
        int newValue= input.nextInt();
        System.out.println("Nhập vị trí muốn chèn");
        int index;
        do {
            index=input.nextInt();
            if (index<0||index>(arrNumber.length-1)){
                System.out.println("Nhập lại vị trí hợp lệ 0->9");
            }
        }while (index<0||index>(arrNumber.length-1));
        System.out.println("Mảng ban đầu:"+Arrays.toString(arrNumber));
        for (int i = arrNumber.length-1; i>index; i--) {
            arrNumber[i]=arrNumber[i-1];
        }
        arrNumber[index]=newValue;
        System.out.println("Mảng sau khi chèn"+Arrays.toString(arrNumber));

    }
}
