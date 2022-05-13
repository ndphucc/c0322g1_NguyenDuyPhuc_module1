package ss6_ke_thua.bai_tap.circle_cylinder;

public class Circle implements Comparable<Circle> {
    private double radius;
    private String color;
    private double area;

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

    public void caculationArea() {
        this.area = Math.pow(this.radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public int compareTo(Circle o) {
        return Double.compare(this.getRadius(), o.getRadius());
    }

//    @Override
//    public int compare(ss6_ke_thua.thuc_hanh.shape.Circle c1, ss6_ke_thua.thuc_hanh.shape.Circle c2) {
//
//    }
}
