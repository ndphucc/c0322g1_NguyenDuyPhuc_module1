package ss11_stack_queue.bai_tap.palindrome;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (checkPalindrome(str) == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println(" Not is palindrome");
        }

    }

    public static boolean checkPalindrome(String str) {
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String[] arrCharter = str.split("");
        for (int i = 0; i < arrCharter.length; i++) {
            if (i <= arrCharter.length / 2) {
                queue.add(arrCharter[i].toLowerCase());
            } else {
                stack.add(arrCharter[i].toLowerCase());
            }
        }
        while (stack.isEmpty() != true && queue.isEmpty() != true) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }
        return true;
    }
}
