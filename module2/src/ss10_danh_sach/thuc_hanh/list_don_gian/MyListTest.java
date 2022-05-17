package ss10_danh_sach.thuc_hanh.list_don_gian;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyListTest {
        public static void main(String[] args) {
                MyList<Integer> listInteger = new MyList<Integer>();
                listInteger.add(1);
                listInteger.add(2);
                listInteger.add(3);
                listInteger.add(3);
                listInteger.add(4);
                listInteger.add(6);

                System.out.println("element 4: "+listInteger.get(4));
                System.out.println("element 1: "+listInteger.get(1));
                System.out.println("element 2: "+listInteger.get(2));
                System.out.println("element 2: "+listInteger.get(5));


        }

}
