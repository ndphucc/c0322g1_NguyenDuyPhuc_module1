package CRUD.bai_tap_lon.service;

import CRUD.bai_tap_lon.model.Agent;
import CRUD.bai_tap_lon.model.CongNhat;
import CRUD.bai_tap_lon.model.QuanLy;
import CRUD.bai_tap_lon.model.SanXuat;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapNhanVien {
    static Map<Integer, Agent> mapNhanVien = new LinkedHashMap<>();

    static {
        mapNhanVien.put(1, new CongNhat("Phuc", "04/08/2002", "Hue", 20));
        mapNhanVien.put(2, new QuanLy("Quang", "4/2/1998", "Da Nang", 50000, 2));
        mapNhanVien.put(3, new SanXuat("Chien", "2/2/2000", "Da Nang", 200));
        mapNhanVien.put(4, new CongNhat("Huy", "4/2/2002", "Hue", 30));
        mapNhanVien.put(5, new CongNhat("Anh", "2/8/2000", "Quang Nam", 25));
    }

    public void display() {
        Set<Integer> set = mapNhanVien.keySet();
        for (Integer item : set) {
            System.out.println("id " + item + ", " + mapNhanVien.get(item));
        }
    }

    public boolean checkId(int id) {
        if (mapNhanVien.containsKey(id)) {
            /** id đã tồn tại
             */
            return true;
        } else {
            /** id chưa tồn tại
             */
            return false;
        }
    }


}
