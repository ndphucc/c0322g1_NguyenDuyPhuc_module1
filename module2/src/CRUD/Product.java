package CRUD;

public class Product {
    private int id;
    private String name;
    private double price;
    private int mount;
    private String product;
    public static int count=1;

    public Product() {
        this.id=count;
        count++;
    }

    public Product(String name, double price, int mount, String product) {
        this.id=count;
        this.name = name;
        this.price = price;
        this.mount = mount;
        this.product = product;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMount() {
        return mount;
    }

    public void setMount(int mount) {
        this.mount = mount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mount=" + mount +
                ", product='" + product + '\'' +
                '}';
    }
}
