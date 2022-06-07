package CRUD.bai_tap_nho_cong_ty_abc.util;

import CRUD.bai_tap_nho_2.model.Person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;

public class ComparatorDateOfBirth implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1 = LocalDate.parse(o1.getDateOfBirth(), dateFormat);
        LocalDate date2 = LocalDate.parse(o2.getDateOfBirth(), dateFormat);
        if (date1.isAfter(date2)) {
            return 1;
        } else if (date1.isBefore(date2)) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}
