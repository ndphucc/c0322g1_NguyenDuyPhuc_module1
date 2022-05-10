package ss6_ke_thua.bai_tap.circle_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1= new Cylinder(5,"white",10);
        cylinder1.caculationArea();
        cylinder1.caculationVolume();
        System.out.println(cylinder1);
        Cylinder cylinder2= new Cylinder();
        System.out.println(cylinder2);
    }

}
