package s1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumbersIntoLetters {
    public static void main(String[] args) {
        String letters = "";
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int hundred = number / 100;
        int x = number % 100;
        int ten = x / 10;
        int units = x % 10;
        if(number==0) {
            System.out.println("zero");
        }else {
            if(hundred>0) {
                if(ten==0&&units==0) {
                    System.out.println(lettersHundred(hundred)+" hundred");
                }else {
                    System.out.println(lettersHundred(hundred)+" hundred and "+lettersTenUnits(ten,units));
                }
            }else {
                System.out.print(lettersTenUnits(ten,units));
            }
        }

    }

    public static String lettersHundred(int number) {
        switch (number) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
        }
        return "";
    }

    public static String lettersTenUnits(int ten, int unit) {
        switch (ten) {
            case 0:
                return lettersHundred(unit);
            case 1:
               switch (unit) {
                   case 0:
                       return "ten";
                   case 1:
                       return "eleven";
                   case 2:
                       return "twelve";
                   case 3:
                       return "thirteen";
                   case 5:
                       return "fifteen";
                   case 4:
                   case 6:
                   case 7:
                   case 8:
                   case 9:
                       return lettersHundred(unit)+"teen";
               }
            case 2:
                return "twenty "+lettersHundred(unit);
            case 3:
                return "thirty "+lettersHundred(unit);
            case 4:
                return "forty "+lettersHundred(unit);
            case 5:
                return "fifty"+lettersHundred(unit);
            case 6:
                return "sixty "+lettersHundred(unit);
            case 7:
                return "seventy "+lettersHundred(unit);
            case 8:
                return "eighty "+lettersHundred(unit);
            case 9:
                return "ninety "+lettersHundred(unit);

        }
        return "";
    }
}
