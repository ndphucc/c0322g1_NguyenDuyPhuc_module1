package CRUD.bai_tap_nho_cong_ty_abc.util;

import CRUD.bai_tap_nho_2.model.Person;

import java.util.Comparator;

public class ComparatorName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
