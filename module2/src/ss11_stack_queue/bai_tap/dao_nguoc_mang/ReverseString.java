package ss11_stack_queue.bai_tap.dao_nguoc_mang;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString<E> {
    public static void main(String[] args) {
        String string = "jhhk kjhkjh";
        String[] stringArr = string.split(" ");
        System.out.println(Arrays.toString(stringArr));

        Stack<String> stringReverse = new Stack<>();
        for (String item : stringArr) {
            stringReverse.push(item);
        }
        string = "";
        while (!stringReverse.isEmpty()) {
            string += stringReverse.pop() + " ";
        }
        System.out.println(string);
    }
}
