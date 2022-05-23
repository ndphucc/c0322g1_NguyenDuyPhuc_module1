package CRUD.bai_tap_lon.model;

import CRUD.bai_tap_lon.service.ChamCong;

public class QuanLy extends Agent implements ChamCong {
    private double luongCoBan;
    private double heSoLuong;

    public QuanLy() {
    }

    public QuanLy(String ten, String ngaySinh, String diaChi, double luongCoBan, double heSoLuong) {
        super(ten, ngaySinh, diaChi);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    @Override
    public String toString() {
        return "QuanLy{" + super.toString() +
                "luongCoBan=" + luongCoBan +
                ", heSoLuong=" + heSoLuong + "lương=" + tinhLuong() +
                '}';
    }

    @Override
    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    @Override
    public void chamCong() {
        System.out.println("quan li cham cong");
    }
}
