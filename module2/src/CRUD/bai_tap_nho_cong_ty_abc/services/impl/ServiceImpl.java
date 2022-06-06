package CRUD.bai_tap_nho_cong_ty_abc.services.impl;

import CRUD.bai_tap_nho_cong_ty_abc.exception.NotFoundEmployeeException;
import CRUD.bai_tap_nho_cong_ty_abc.model.NhanVien;
import CRUD.bai_tap_nho_cong_ty_abc.model.QuanLi;
import CRUD.bai_tap_nho_cong_ty_abc.model.SanXuat;
import CRUD.bai_tap_nho_cong_ty_abc.services.Service;
import CRUD.bai_tap_nho_cong_ty_abc.util.ReadAndWriteFile;
import CRUD.bai_tap_nho_cong_ty_abc.util.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServiceImpl implements Service {
    static List<NhanVien> nhanVienLinkedList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void addQuanLi() {
        readFile();
        nhanVienLinkedList.add(new QuanLi(getId(), getMaNhanVien(), getHoTen(), getNgaySinh(), getDiaChi(), getLuongCoban(), getHeSoLuong()));
        System.out.println("Thêm thành công");
        writeFile();
    }

    @Override
    public void addSanXuat() {
        readFile();
        nhanVienLinkedList.add(new SanXuat(getId(), getMaNhanVien(), getHoTen(), getNgaySinh(), getDiaChi(), getSoSanPham(), getGiaMoiSanPham()));
        System.out.println("Thêm thành công");
        writeFile();
    }

    @Override
    public void display() {
        readFile();
        for (NhanVien nhanVien : nhanVienLinkedList) {
            System.out.println(nhanVien);
        }
    }

    @Override
    public void remove() {
        readFile();
        System.out.println("Nhập id bạn muốn xóa");
        String id = scanner.nextLine();
        for (NhanVien nhanVien : nhanVienLinkedList) {
            if (nhanVien.getId().equals(id)) {
                System.out.println("bạn muốn xóa " + nhanVien);
                do {
                    String choose = scanner.nextLine();
                    switch (choose) {
                        case "1":
                            nhanVienLinkedList.remove(nhanVien);
                            System.out.println("bạn đã xóa thành công");
                            writeFile();
                            return;
                        case "2":
                            System.out.println("Xóa không thành công");
                            return;
                        default:
                            System.out.println("lựa chọn không hợp lệ vui lòng chọn lại");
                    }
                } while (true);

            }
        }
        try {
            throw new NotFoundEmployeeException("Id không tồn tại");
        } catch (NotFoundEmployeeException e) {
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void find() {
        readFile();
        System.out.println("Nhập từ bạn muốn tìm kiếm");
        String find = scanner.nextLine();
        for (NhanVien nhanVien : nhanVienLinkedList) {
            if (nhanVien.getInfor().contains(find)) {
                System.out.println(nhanVien);
            }
        }
    }

    public String getId() {
        int id = 1;
        if (nhanVienLinkedList.isEmpty()) {
            return id + "";
        } else {
            for (NhanVien nhanVien : nhanVienLinkedList) {
                if (Integer.parseInt(nhanVien.getId()) > id) {
                    id = Integer.parseInt(nhanVien.getId());
                }
            }
        }
        id += 1;
        return id + "";
    }

    public String getMaNhanVien() {
        do {
            System.out.println("Nhập mã nhân viên");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public String getHoTen() {
        do {
            System.out.println("Nhập tên nhân viên");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public String getNgaySinh() {
        do {
            System.out.println("Nhập ngày sinh");
            String temp = scanner.nextLine();
            if (Regex.regexDate(temp)) {
                if (Regex.regexBirthDay(temp)) {
                    return temp;
                } else {
                    System.out.println("Ngày sinh phải trên 18 tuổi");
                }
            } else {
                System.out.println("Ngày sinh phải đúng định dạng dd/MM/yyyy");
            }
        } while (true);
    }

    public String getDiaChi() {
        do {
            System.out.println("Nhập địa chỉ");
            String temp = scanner.nextLine();
            if (!temp.equals("")) {
                return temp;
            }
        } while (true);
    }

    public double getLuongCoban() {
        System.out.println("Nhập lương cơ bản");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public double getHeSoLuong() {
        System.out.println("Nhập hệ số lương");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public double getSoSanPham() {
        System.out.println("Nhập số sản phẩm");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }

    public double getGiaMoiSanPham() {
        System.out.println("Nhập giá mỗi sản phẩm");
        String temp = scanner.nextLine();
        return parseDouble(temp);
    }


    public void readFile() {
        nhanVienLinkedList.clear();
        List<String[]> strings = ReadAndWriteFile.readFile("src/CRUD/bai_tap_nho_cong_ty_abc/data/nhan_vien.csv");
        for (String[] line : strings) {
            if (line[7].equals("1")) {
                nhanVienLinkedList.add(new QuanLi(line[0], line[1], line[2], line[3], line[4], Double.parseDouble(line[5]), Double.parseDouble(line[6])));
            } else {
                nhanVienLinkedList.add(new SanXuat(line[0], line[1], line[2], line[3], line[4], Double.parseDouble(line[5]), Double.parseDouble(line[6])));
            }
        }
    }

    public void writeFile() {
        ReadAndWriteFile.clearFile("src/CRUD/bai_tap_nho_cong_ty_abc/data/nhan_vien.csv");
        for (NhanVien nhanVien : nhanVienLinkedList) {
            ReadAndWriteFile.writeFile("src/CRUD/bai_tap_nho_cong_ty_abc/data/nhan_vien.csv", nhanVien.getInfor());
        }
    }

    public static double parseDouble(String str) {
        double result = 0;
        boolean flag = true;
        do {
            try {
                result = Double.parseDouble(str);
                flag = false;
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage() + "Hãy nhập số ");
                str = scanner.nextLine();
            }
        } while (flag);
        return result;
    }

}
