package CRUD.bai_tap_lon.model;

public abstract class Agent implements Comparable<Agent> {
    private String ten;
    private String ngaySinh;

    @Override
    /**
     *Muốn sử dụng được comparable thì cần sử dụng class chứa các đối tượng cần sắp xếp implements Comparable<T>
     *và triển khai lại phương thức compareto
     * Nên sử dụng comparable khi danh sách chỉ có một tiêu chí sắp xếp
     * Nếu có 2 tiêu chí sắp xếp trở lên thì bắt buộc phải dùng comparator
     * -Comparable:
     * +Triển khai trong class cần sắp xếp
     * +Triển khai method comparato
     * +Thuộc java.lang
     * +Chỉ có thể sắp xếp theo 1 tiêu chí
     * -Comparator
     * +Triển khai ngoài class
     * +Triển khai method compare
     * +Thuộc java.utill
     * +Có thể sắp xếp theo nhiều tiêu chí
     */
    public int compareTo(Agent o) {
        if (this.tinhLuong() > o.tinhLuong()) {
            return 1;
        } else if (this.tinhLuong() < o.tinhLuong()) {
            return -1;
        } else {
            if (this.ten.compareTo(o.ten) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    private String diaChi;

    public Agent() {
    }

    public Agent(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    /**
     * iv:class cha cần phương thức abstract vì các class con đều triển khai lại phương thức tinhLuong();
     */

    public abstract double tinhLuong();
}
