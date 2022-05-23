package ss10_danh_sach.bai_tap.trien_khai_lop_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add(0, "Phuc");
        list.add(1, "hai");
        list.add(2, "ba");
        list.add(3, "bon");
        list.add(4, "nam");
        list.addLast("Bao");
        list.remove(1);
        list.remove("bon");
        System.out.println(list.contains("nam"));
        System.out.println(list.indexOf("nam"));
        System.out.println(list.getLast());
        list.clear();
        list.printList();
    }
}
