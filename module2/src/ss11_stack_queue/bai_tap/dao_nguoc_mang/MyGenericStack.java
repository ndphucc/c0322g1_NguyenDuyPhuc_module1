package ss11_stack_queue.bai_tap.dao_nguoc_mang;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<E> {
    private final LinkedList<E> stack;

    public MyGenericStack() {
        stack = new LinkedList<>();
    }

    public void Push(E element) {
        stack.addFirst(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }
}
