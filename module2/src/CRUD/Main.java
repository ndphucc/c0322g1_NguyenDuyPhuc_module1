package CRUD;

import java.util.Scanner;


public class Main {
    public static Product[] arrProduct =new Product[100];
    public static int[] arr =new int[100];
    public static int count=5;
    static Scanner scanner= new Scanner(System.in);

    static {
        arrProduct[0]=new Product("abc",5000,20,"mot");
        arrProduct[1]=new Product("abc",5000,20,"hai");
        arrProduct[2]=new Product("ac",5000,20,"ba");
        arrProduct[3]=new Product("abc",5000,20,"bon");
        arrProduct[4]=new Product("ac",5000,20,"nam");
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
    }
    public static void display(int[] arrb) {
        for (Product product : arrProduct) {
            for (int i : arrb) {
                if ((product!=null&&i == product.getId())) {
                    System.out.println(product);
                }
            }
        }
    }
    public static void add() {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter mount");
        int mount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product");
        String product =scanner.nextLine();
        arrProduct[count]= new Product(name,price,mount,product);
        arr[count]=arrProduct[count].getId();
        count++;

    }
    public static int[] find(String str) {
        int[] arr = new int[arrProduct.length];
        int count=0;
        for (Product product : arrProduct) {
            if (product != null && product.getName().contains(str)) {
                arr[count] = product.getId();
                count++;
            }
        }
        return arr;
    }
    public static void remove(int id) {
        for (int i = 0; i < arrProduct.length; i++) {
           if (arrProduct[i]!=null&&arrProduct[i].getId()==id) {
               arrProduct[i]=null;
           }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==id) {
                arr[i]=0;
            }
        }
    }
    public static void update(int id) {
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter mount");
        int mount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product");
        String product =scanner.nextLine();
        for (Product value : arrProduct) {
            if (value != null && value.getId() == id) {
                value.setName(name);
                value.setPrice(price);
                value.setMount(mount);
                value.setProduct(product);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---------Product Management------------");
            System.out.println("1.Display list Pro");
            System.out.println("2.Add new Product");
            System.out.println("3.Search Product");
            System.out.println("4.Delete Product");
            System.out.println("5.Update Product");
            System.out.println("6.Exit");
            System.out.println("Choose options");
            int choose= Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    display(arr);
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    System.out.println("nhap ten muon tim");
                    String str = scanner.nextLine();
                    display(find(str));
                    break;
                case 4:
                    System.out.println("Enter delete id");
                    int id = Integer.parseInt(scanner.nextLine());
                    remove(id);
                    break;
                case 5:
                    System.out.println("Enter update id");
                    id = Integer.parseInt(scanner.nextLine());
                    update(id);
                    break;
                case 6:
                    System.exit(0);
                    break;

            }

        }while (true);
    }
}
