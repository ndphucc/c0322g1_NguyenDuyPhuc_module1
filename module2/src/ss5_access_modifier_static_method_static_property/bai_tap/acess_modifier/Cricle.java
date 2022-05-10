package ss5_access_modifier_static_method_static_property.bai_tap.acess_modifier;

public class Cricle {
    private double radius = 1.0;
    private String color ="red";
    Cricle() {

    }
    Cricle(double r) {
        this.radius=r;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }
}
