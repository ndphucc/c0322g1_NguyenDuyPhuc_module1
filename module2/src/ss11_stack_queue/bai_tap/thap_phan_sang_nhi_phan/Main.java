package ss11_stack_queue.bai_tap.thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackBinary = new Stack<>();
        StringBuilder binary = new StringBuilder();
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 0) {
            binary = new StringBuilder("0");
        }
        while (number != 0) {
            stackBinary.push(number % 2);
            number = number / 2;
        }
        while (!stackBinary.isEmpty()) {
            binary.append(stackBinary.pop());
        }
        System.out.println(binary);
    }
}
