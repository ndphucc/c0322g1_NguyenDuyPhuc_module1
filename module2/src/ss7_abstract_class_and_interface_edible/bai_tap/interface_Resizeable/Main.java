package ss7_abstract_class_and_interface_edible.bai_tap.interface_Resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Circle(5);
        arrShape[1] = new Rectangle(5, 10);
        System.out.println("Dien tich truoc khi thay doi");
        System.out.println(((Circle)arrShape[0]).getArea());
        System.out.println(((Rectangle)arrShape[1]).getArea());
        System.out.println("Dien tich sau khi thay doi");
        ((Circle)arrShape[0]).resize(Math.random()*100);
        ((Rectangle)arrShape[1]).resize(Math.random()*100);
        System.out.println(((Circle)arrShape[0]).getArea());
        System.out.println(((Rectangle)arrShape[1]).getArea());
    }
}
