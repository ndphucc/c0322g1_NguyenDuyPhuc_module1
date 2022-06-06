package CRUD.bai_tap_nho_cong_ty_abc.model;

public class SanXuat extends NhanVien {
    private double soSanPham;
    private double giaMoiSanPham;

    public SanXuat() {
    }

    public SanXuat(String id, String maNhanVien, String hoTen, String ngaySinh, String diaChi, double soSanPham, double giaMoiSanPham) {
        super(id, maNhanVien, hoTen, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
        this.giaMoiSanPham = giaMoiSanPham;
    }

    public double getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(double soSanPham) {
        this.soSanPham = soSanPham;
    }

    public double getGiaMoiSanPham() {
        return giaMoiSanPham;
    }

    public void setGiaMoiSanPham(double giaMoiSanPham) {
        this.giaMoiSanPham = giaMoiSanPham;
    }

    @Override
    public String toString() {
        return super.toString()+ "SanXuat{" +
                "soSanPham=" + soSanPham +
                ", giaMoiSanPham=" + giaMoiSanPham +
                '}';
    }

    @Override
    public String getInfor() {
        return super.getId() + ","
                + super.getMaNhanVien() + ","
                + super.getHoTen() + ","
                + super.getNgaySinh() + ","
                + super.getDiaChi() + ","
                + this.soSanPham+ ","
                + this.giaMoiSanPham+","
                +"2";
    }
}
