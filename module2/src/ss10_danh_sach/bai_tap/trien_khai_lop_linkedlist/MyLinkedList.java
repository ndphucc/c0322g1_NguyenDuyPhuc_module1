package ss10_danh_sach.bai_tap.trien_khai_lop_linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNode;

    private class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {

    }

    public void add(int index, E element) {
        if (numNode == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            Node node = new Node(element);
            temp.next = node;
            node.next = holder;
            numNode++;

        }

    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNode++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; temp.next != null; i++) {
            temp = temp.next;
        }
        Node node = new Node(e);
        temp.next = node;
        numNode++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Object remove(int index) {
        Node temp = head;
        Node result;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        result = temp.next;
        holder = result.next;
        temp.next = holder;
        numNode--;
        return result;
    }

    public boolean remove(Object e) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if (temp.next.data == e) {
                temp.next = temp.next.next;
                numNode--;
                return true;
            } else {
                temp = temp.next;
            }

        }
        return false;
    }

    public int size() {
        return numNode;
    }

    public boolean contains(E o) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.data == o) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNode; i++) {
            if (temp.data == data) {
                return i;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    public Object get(int i) {
        Node temp = head;
        for (int j = 0; j < numNode; j++) {
            if (i == j) {
                return temp.data;
            } else {
                temp = temp.next;
            }
        }
        return "";
    }

    public Object getFirst() {
        return head.data;
    }

    public Object getLast() {
        Node temp = head;
        for (int i = 0; i < numNode - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void clear() {
        head.next = null;
    }


}
