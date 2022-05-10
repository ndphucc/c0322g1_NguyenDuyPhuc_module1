package ss5_access_modifier_static_method_static_property.bai_tap.acess_modifier;

public class TestCricle {
    public static void main(String[] args) {
        Cricle cricle1= new Cricle(5);
        System.out.println("Ban kinh : "+cricle1.getRadius());
        System.out.println("Dien tich : "+cricle1.getArea());
    }
}
