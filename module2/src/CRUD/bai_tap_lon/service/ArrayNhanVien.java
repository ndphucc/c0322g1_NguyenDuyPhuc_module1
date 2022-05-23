package CRUD.bai_tap_lon.service;

import CRUD.bai_tap_lon.model.Agent;
import CRUD.bai_tap_lon.model.CongNhat;
import CRUD.bai_tap_lon.model.QuanLy;
import CRUD.bai_tap_lon.model.SanXuat;

public class ArrayNhanVien {
    /**
     * iv: từ khóa instanceof để kiểm tra xem đối tượng có phải là thể hiện class nào đó hay không
     * v :khi có 1001 nhân viên lưu trữ trong mang 1000 phần tử thì sẽ bị lỗi tràn mảng
     * vi:phương thức toString dc ghi đè lại từ class Object là thể hiện của đa hình ở runtime
     * vii: các Constructor có cùng tên nhưng khác tham số truyền vào là thể hiện của đa hình ở compile
     */
    static Agent[] array = new Agent[4];

    static {
        array[0] = new CongNhat("Phuc", "04/08/2002", "Hue", 20);
        array[1] = new QuanLy("Quang", "4/2/1998", "Da Nang", 50000, 2);
        array[2] = new SanXuat("Chien", "2/2/2000", "Da Nang", 200);
        array[3] = new CongNhat("Huy", "4/2/2002", "Hue", 30);
        array[4] = new CongNhat("Anh", "2/8/2000", "Quang Nam", 25);
    }

    public static void display() {
        for (Agent item : array) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

}
