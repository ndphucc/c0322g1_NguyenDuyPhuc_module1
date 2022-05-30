package ss11_stack_queue.bai_tap.dao_nguoc_mang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArr {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arrInt = {1, 2, 5, 6, 7, 8};
        for (int j : arrInt) {
            stack.push(j);
        }
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arrInt));
    }
}
