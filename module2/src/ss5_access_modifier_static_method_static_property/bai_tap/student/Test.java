package ss5_access_modifier_static_method_static_property.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Ten : "+student1.setName("Alex"));
        System.out.println("Ten : "+student1.setClasses("C03"));
    }
}
