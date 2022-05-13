package ss6_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;
    private double volume;

    Cylinder() {
        super();
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void caculationVolume() {
        this.volume = Math.PI * Math.pow(this.getRadius(), 2) * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "Radius" + this.getRadius() +
                "height=" + height +
                ", volume=" + volume +
                ",Area" + this.getArea() +
                '}';
    }
}
