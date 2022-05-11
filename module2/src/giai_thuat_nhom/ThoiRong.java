package giai_thuat_nhom;

import java.util.Scanner;

public class ThoiRong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a=x-1;
        int b=x+1;
        int e=1;
        for (int i = 1; i <=x; i++) {
            for (int j = 0; j <= x*2+1; j++) {
                if(j==a||j==b) {
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }
            }
            a--;
            b++;
            e++;
            System.out.println();
        }
        a=2;
        b=x*2;
        e=x-1;
        for (int i = 1; i < x; i++) {
            for (int j = 1; j <= x*2+1; j++) {
                if(j==a||j==b) {
                    System.out.print(e);
                }else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            e--;
            System.out.println();
        }

    }
}
