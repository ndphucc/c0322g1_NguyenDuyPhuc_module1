package CRUD.bai_tap_lon.service;

import CRUD.bai_tap_lon.model.Agent;
import CRUD.bai_tap_lon.model.CongNhat;
import CRUD.bai_tap_lon.model.QuanLy;
import CRUD.bai_tap_lon.model.SanXuat;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNhanVien {
    /**
     * iii: ArrayList không cần khởi tạo trước 1000 phần tử vì độ dài của mảng có thể thay đổi để phù hợp với số lượng phần tử thay đổi được lưu trong mảng
     * iv: Nếu công ty có 1001 nhân viên thì mảng sẽ tự động thay đổi độ dài bằng 1001 nên sẽ không có vấn đề
     * v:ưu điểm arraylist so với array
     * + kích thước có thể thay đổi
     * + cung cấp nhiều phương thức để thao tác
     * nhược điểm:
     * +chỉ có thể lưu trữ đối tượng
     * + các thao tác sẽ chậm hơn
     */
    static List<Agent> arrayListAgent = new ArrayList<>();

    static {
        arrayListAgent.add(new CongNhat("Phuc", "04/08/2002", "Hue", 20));
        arrayListAgent.add(new QuanLy("Quang", "4/2/1998", "Da Nang", 50000, 2));
        arrayListAgent.add(new SanXuat("Chien", "2/2/2000", "Da Nang", 200));
        arrayListAgent.add(new CongNhat("Huy", "4/2/2002", "Hue", 30));
        arrayListAgent.add(new CongNhat("Anh", "2/8/2000", "Quang Nam", 25));
    }

    public void display() {
        for (Agent item : arrayListAgent) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

}
