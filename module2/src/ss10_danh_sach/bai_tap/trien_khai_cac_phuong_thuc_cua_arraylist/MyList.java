package ss10_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public MyList(int capacity) {
        for (int i = 0; i < capacity; i++) {
            elements[i] = null;
        }
    }

    public void add(int index, E element) {
        size++;
        get(index);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;

    }

    public Object remove(int index) {
        get(index);
        Object result = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return result;
    }

    public int size() {
        return size;
    }

    public MyList<E> clone() {
        MyList<E> result = new MyList<>();
        result.elements = Arrays.copyOf(elements, size);
        result.size = size;
        return result;

    }

    public boolean contains(E o) {
        if (o != null) {
            for (int i = 0; i < size; i++) {
                if (o == elements[i]) {
                    return true;
                }
            }
        }
        return false;

    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        size++;
        elements[size] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (size < minCapacity) {
            elements = Arrays.copyOf(elements, minCapacity);
        } else {
            throw new IllegalArgumentException("minCapacity" + elements);
        }
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
