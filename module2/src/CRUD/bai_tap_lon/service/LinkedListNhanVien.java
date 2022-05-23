package CRUD.bai_tap_lon.service;

import CRUD.bai_tap_lon.model.Agent;
import CRUD.bai_tap_lon.model.CongNhat;
import CRUD.bai_tap_lon.model.QuanLy;
import CRUD.bai_tap_lon.model.SanXuat;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListNhanVien {
    /**
     * ii:Không nên dùng fori để duyệt linkedlist vì các phần tử được lưu liên kết với nhau bằng các tham chiếu nên nếu dùng fori
     * thì sẽ có độ phức tạp của thuật toán cao hơn so với foreach
     * iii: nếu công ty liên tục thay đổi nhân sự thì nên dùng linkedlist vì ưu điểm của LinkedList so với arraylist là xóa và thêm
     * iv:nhược điểm của linkedlist so với arraylist
     * +các thao tác truy xuất sẽ chậm hơn
     * -ưu điểm:
     * +các thao tác chèn xóa sẽ nhanh hơn
     */
    static List<Agent> linkedListAgent = new LinkedList<>();

    static {
        linkedListAgent.add(new CongNhat("Phuc", "04/08/2002", "Hue", 20));
        linkedListAgent.add(new QuanLy("Quang", "4/2/1998", "Da Nang", 50000, 2));
        linkedListAgent.add(new SanXuat("Chien", "2/2/2000", "Da Nang", 200));
        linkedListAgent.add(new CongNhat("Huy", "4/2/2002", "Hue", 30));
        linkedListAgent.add(new CongNhat("Anh", "2/8/2000", "Quang Nam", 30));
    }

    public void display() {
        for (Agent item : linkedListAgent) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public void sapXepTheoLuong() {
        Collections.sort(linkedListAgent, new SapXepLuongTangDan());
    }

    public void sapXepTheoTen() {
        Collections.sort(linkedListAgent, new SapXepTenTangDan());
    }

    public void sapXepTheoTenVaLuong() {
        Collections.sort(linkedListAgent);
    }
}
