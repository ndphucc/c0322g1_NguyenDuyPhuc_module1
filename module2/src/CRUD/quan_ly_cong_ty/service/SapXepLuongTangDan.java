package CRUD.quan_ly_cong_ty.service;

import CRUD.quan_ly_cong_ty.model.Agent;

import java.util.Comparator;

public class SapXepLuongTangDan implements Comparator<Agent> {
    @Override
    public int compare(Agent o1, Agent o2) {
        if (o1.tinhLuong() > o2.tinhLuong()) {
            return 1;
        } else {
            return -1;
        }
    }
}
