package CRUD.quan_ly_cong_ty.model;

public class CongNhat extends Agent {
    private double ngayCong;

    public CongNhat() {
    }

    public CongNhat(String ten, String ngaySinh, String diaChi, double ngayCong) {
        super(ten, ngaySinh, diaChi);
        this.ngayCong = ngayCong;
    }

    public double getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(double ngayCong) {
        this.ngayCong = ngayCong;
    }

    @Override
    public String toString() {
        return "CongNhat{" + super.toString() +
                "ngayCong=" + ngayCong + "lương=" + tinhLuong() +
                '}';
    }

    @Override
    public double tinhLuong() {
        return this.ngayCong * 120000;
    }
}
