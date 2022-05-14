package CRUD.quan_li_nhan_vien_va_hoc_vien;

import java.util.Scanner;

public class Main {

    public static Person[] arrPerson = new Person[100];
    static Scanner scanner = new Scanner(System.in);

    static {
        arrPerson[0] = new Student(1, "Phuc", 20, "nam", 10);
        arrPerson[1] = new Teacher(2, "Công", 30, "nam", 100000);
        arrPerson[2] = new Student(4, "Hai", 18, "nam", 10);
        arrPerson[3] = new Student(10, "Hoàng", 25, "nam", 8);
        arrPerson[4] = new Student(5, "Hùng", 21, "nam", 9);
    }

    public static void main(String[] args) {
        do {
            System.out.println("---------Management person---------- ");
            System.out.println("1.Display");
            System.out.println("2.Add");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Search");
            System.out.println("6.Sort");
            System.out.println("7.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                    create();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sort();
                    break;
                case 7:
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void display() {
        for (Person item : arrPerson)
            if (item != null) {
                System.out.println(item);
            }
    }

    public static int checkId(int id) {
        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i] != null && arrPerson[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void addStudent(int id, String name, int age, String gender, double point) {
        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i] == null) {
                arrPerson[i] = new Student(id, name, age, gender, point);
                break;
            }
        }
    }

    public static void addTeacher(int id, String name, int age, String gender, double salary) {
        for (int i = 0; i < arrPerson.length; i++) {
            if (arrPerson[i] == null) {
                arrPerson[i] = new Teacher(id, name, age, gender, salary);
                break;
            }
        }
    }

    public static void update() {
        System.out.println("Nhập id bạn muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id) == -1) {
            System.out.println("Id ko tồn tại");
            update();
        } else {
            System.out.println("Bạn muốn sửa thành ");
            System.out.println("1.Student");
            System.out.println("2.Teacher");
            int choose = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên");
            String name = (scanner.nextLine());
            System.out.println("Nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giới tính");
            String gender = (scanner.nextLine());
            if (choose == 1) {
                System.out.println("Nhập điểm");
                double point = Double.parseDouble(scanner.nextLine());
                arrPerson[checkId(id)] = null;
                addStudent(id, name, age, gender, point);

            } else {
                System.out.println("Nhập Lương");
                double salary = Double.parseDouble(scanner.nextLine());
                arrPerson[checkId(id)] = null;
                addTeacher(id, name, age, gender, salary);
            }
        }
    }

    public static void create() {
        System.out.println("Chọn số bạn muốn thêm");
        System.out.println("1.Student");
        System.out.println("2.Teacher");
        int choose = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id) != -1) {
            System.out.println("Id bị trùng");
            create();
        } else {
            System.out.println("Nhập tên");
            String name = (scanner.nextLine());
            System.out.println("Nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập giới tính");
            String gender = (scanner.nextLine());
            if (choose == 1) {
                System.out.println("Nhập điểm");
                double point = Double.parseDouble(scanner.nextLine());
                addStudent(id, name, age, gender, point);
            } else {
                System.out.println("Nhập Lương");
                double salary = Double.parseDouble(scanner.nextLine());
                addTeacher(id, name, age, gender, salary);
            }
            System.out.println("Bạn đã thêm thành công");
        }

    }

    public static void remove() {
        System.out.println("Nhập id bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        if (checkId(id) == -1) {
            System.out.println("id bạn muốn xóa không tồn tại");
        } else {
            System.out.println("Bạn muốn xóa" + arrPerson[checkId(id)].toString());
            System.out.println("1.Xóa");
            System.out.println("2.Hủy");
            int choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                arrPerson[checkId(id)] = null;
                System.out.println("Bạn đã xóa thành công");
            }
        }
    }

    public static void search() {
        System.out.println("Nhập từ bạn muốn tìm");
        String search = scanner.nextLine();
        boolean flag = true;
        for (Person person : arrPerson) {
            if (person != null && (person.getName().contains(search))) {
                System.out.println(person);
                flag = false;
            }
        }
        if (flag) {
            System.out.println("Không tìm thấy");
        }
    }

    public static void sort() {
        for (int i = 0; arrPerson[i + 1] != null; i++) {
            for (int j = i + 1; arrPerson[j] != null; j++) {
                if (arrPerson[i].getId()>arrPerson[j].getId()) {
                    Person person=arrPerson[i];
                    arrPerson[i]=arrPerson[j];
                    arrPerson[j]= person;
                }
            }
        }
        System.out.println("Danh sách đã dc sắp xếp lại");

    }
}