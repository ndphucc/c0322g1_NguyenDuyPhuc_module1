package ss7_abstract_class_and_interface_edible.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[4];
        Rectangle shape1 = new Rectangle();
        arrShape[0] = shape1;
        Circle shape2 = new Circle(5);
        arrShape[1] = shape2;
        Circle shape3 = new Circle();
        arrShape[2] = shape3;
        Square shape4 = new Square();
        arrShape[3] = shape4;
        for (int i = 0; i < arrShape.length; i++) {
            if (arrShape[i] instanceof Square) {
                ((Square) arrShape[i]).howToColor();
            } else {
                System.out.println(arrShape[i].getArea());
            }
        }
    }

}
