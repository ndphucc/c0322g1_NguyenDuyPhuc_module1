package ss7_abstract_class_and_interface_edible.thuc_hanh.interface_comparable2;

import ss6_ke_thua.thuc_hanh.shape.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return Double.compare(c2.getRadius(), c1.getRadius());
    }
}
