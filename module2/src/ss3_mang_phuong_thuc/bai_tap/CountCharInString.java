package ss3_mang_phuong_thuc.bai_tap;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the String");
        String sti = "dfajshdfkhkdkksdfkshhh";
        System.out.println(sti);

        System.out.println("Input the characters");
        String cha= scanner.nextLine();
        char[] ch= sti.toCharArray();
        char[] chacha=cha.toCharArray();

        int count =0;
        for (int i = 0; i <ch.length ; i++) {
            if (chacha[0]==ch[i]){
                count++;
            }

        }
        System.out.println(cha + " : có "+ count +" xuất hiện ");
    }

}
