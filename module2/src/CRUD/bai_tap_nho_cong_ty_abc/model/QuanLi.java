package CRUD.bai_tap_nho_cong_ty_abc.model;

public class QuanLi extends NhanVien {
    private double luongCoban;
    private double heSoLuong;

    public QuanLi() {
    }

    public QuanLi(String id, String maNhanVien, String hoTen, String ngaySinh, String diaChi, double luongCoban, double heSoLuong) {
        super(id, maNhanVien, hoTen, ngaySinh, diaChi);
        this.luongCoban = luongCoban;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoban() {
        return luongCoban;
    }

    public void setLuongCoban(double luongCoban) {
        this.luongCoban = luongCoban;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return super.toString() + " QuanLi{" +
                "luongCoban=" + luongCoban +
                ", heSoLuong=" + heSoLuong +
                '}';
    }

    @Override
    public String getInfor() {
        return super.getId() + ","
                + super.getMaNhanVien() + ","
                + super.getHoTen() + ","
                + super.getNgaySinh() + ","
                + super.getDiaChi() + ","
                + this.luongCoban + ","
                + this.heSoLuong + ","
                + "1";
    }
}
