package ss10_danh_sach.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> elements = new MyList<>();
        elements.add(0, 1);
        elements.add(1, 5);
        elements.add(2, 6);
        elements.remove(1);
        System.out.println(elements.get(1));
    }
}
