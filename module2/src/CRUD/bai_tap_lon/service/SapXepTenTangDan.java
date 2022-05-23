package CRUD.bai_tap_lon.service;

import CRUD.bai_tap_lon.model.Agent;

import java.util.Comparator;

public class SapXepTenTangDan implements Comparator<Agent> {

    @Override
    public int compare(Agent o1, Agent o2) {
        if (o1.getTen().compareTo(o2.getTen()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
