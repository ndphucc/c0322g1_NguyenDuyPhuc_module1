package ss11_stack_queue.bai_tap.kiem_tra_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        checkExpression(expression);
    }

    public static void checkExpression(String expression) {
        String[] temp = expression.split("");
        Stack<String> stackCharacter = new Stack<>();
        for (String s : temp) {
            if (s.equals("(")) {
                stackCharacter.push(s);
            } else if (s.equals(")")) {
                if (stackCharacter.isEmpty()) {
                    System.out.println("???");
                    return;
                } else if (!stackCharacter.pop().equals("(")) {
                    System.out.println("???");
                    return;
                }
            }
        }
        if (stackCharacter.isEmpty()) {
            System.out.println("well");
        } else {
            System.out.println("???");
        }
    }
}
