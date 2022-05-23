package CRUD.quan_ly_cong_ty.service;

public interface ChamCong {
    /**
     * i.nên dùng interface vì nhân viên công nhật không cần triển khai phương thức chamCong()
     * ii.nên dùng abstract khi tất cả các lớp con kế thừa lớp cha đều triển khai lại phương thức
     * abstract của lớp cha còn nếu không thì nên dùng interface
     */
    void chamCong();
}
