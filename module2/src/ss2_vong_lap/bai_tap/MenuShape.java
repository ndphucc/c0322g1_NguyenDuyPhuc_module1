package ss2_vong_lap.bai_tap;

import java.util.Scanner;

public class MenuShape {
    public static void main(String[] args) {
        int number = -1;
        Scanner sc = new Scanner(System.in);

        while (number != 4) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");

            number = sc.nextInt();
            if (number == 1) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
            } else if (number == 2) {
                System.out.println("choose right angle\n1.top-left\n2.top-right\n3.botton-left\n4.botton-right");
                int choose=sc.nextInt();
                switch (choose) {
                    case 1:
                        for (int i = 0; i <= 5; i++) {
                            for (int j = 0; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        for(int i=1;i<=5;i++) {
                            int a=5-i;
                            int b=5-a;
                            for(int c=1;c<=a;c++) {
                                System.out.print(" ");
                            }
                            for (int d=1;d<=b;d++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        for (int i=5;i>=1;i--) {
                            for (int j=i;j>=1;j--) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        for(int i=1;i<=5;i++) {
                            int a=5-i+1;
                            int b=5-a;
                            for(int c=1;c<=b;c++) {
                                System.out.print(" ");
                            }
                            for (int d=1;d<=a;d++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;

                }

            } else if (number == 3) {
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println("");
                }
            } else if (number == 4) {
                System.exit(4);
            } else {
                System.out.println("No number!");
            }
        }
    }
}
