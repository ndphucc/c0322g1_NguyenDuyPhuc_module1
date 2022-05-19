package ss11_stack_queue.bai_tap.to_chuc_du_lieu_hop_li;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("Huyền", "nữ", "09/10/1997"));
        person.add(new Person("An", "nam", "09/01/1990"));
        person.add(new Person("Lan", "nữ", "19/08/1998"));
        person.add(new Person("Hà", "nam", "09/05/1996"));
        System.out.println("Danh sách nhân viên: ");
        for (Person item : person) {
            System.out.println(item);
        }
        Queue<Person> male = new LinkedList<>();
        Queue<Person> female = new LinkedList<>();
        for (Person item : person) {
            if (item.getGender().equals("nữ")) {
                male.add(item);
            } else {
                female.add(item);
            }
        }
        person.clear();
        while (!(male.isEmpty() && female.isEmpty())) {
            if (!male.isEmpty()) {
                person.add(male.poll());
            } else {
                person.add(female.poll());
            }
        }
        System.out.println("-----");
        for (Person item : person) {
            System.out.println(item);
        }
    }
}
