package ss5_access_modifier_static_method_static_property.bai_tap.student;

public class Student {
    private String name="John";
    private String classes="C02";
    public Student() {

    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String setClasses(String classes) {
        this.classes = classes;
        return this.classes;
    }
}
