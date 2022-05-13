package ss7_abstract_class_and_interface_edible.thuc_hanh.interface_comparable2;

import ss6_ke_thua.bai_tap.circle_cylinder.Circle;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, "indigo");

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles);
//        Collections.sort(circles, new CircleComparator());

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

//        Collections.sort(circles, Collections.reverseOrder());

        // 4 2 6 8 9
        // e1 ? e2
        //
        // 1 => sort
        // -1 => ko sort
    }
}
