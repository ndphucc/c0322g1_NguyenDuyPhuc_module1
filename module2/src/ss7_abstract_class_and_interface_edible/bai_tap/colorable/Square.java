package ss7_abstract_class_and_interface_edible.bai_tap.colorable;

public class Square extends Shape implements Colorable {
    private double width = 5;

    public Square(double width) {
        this.width = width;
    }

    public Square(String color, boolean filled, double width) {
        super(color, filled);
        this.width = width;
    }

    public Square() {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * width;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
