package CRUD.bai_tap_lon.model;

import CRUD.bai_tap_lon.service.ChamCong;

public class SanXuat extends Agent implements ChamCong {
    private double soSanPham;

    public SanXuat() {
    }

    public SanXuat(String ten, String ngaySinh, String diaChi, double soSanPham) {
        super(ten, ngaySinh, diaChi);
        this.soSanPham = soSanPham;
    }

    public double getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(double soSanPham) {
        this.soSanPham = soSanPham;
    }

    @Override
    public String toString() {
        return "SanXuat{" + super.toString() +
                "soSanPham=" + soSanPham + "lương=" + tinhLuong() +
                '}';
    }

    @Override
    public double tinhLuong() {
        return this.soSanPham * 50000;
    }

    @Override
    public void chamCong() {
        System.out.println("San xuat cham cong");
    }
}
