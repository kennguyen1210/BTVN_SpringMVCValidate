package ra.academy.model;

public class Product {
    private Long id;
    private String name;
    private String des;
    private double price;
    private int stock;
    private boolean status;

    public Product() {
    }

    public Product(Long id, String name, String des, double price, int stock, boolean status) {
        this.id = id;
        this.name = name;
        this.des = des;
        this.price = price;
        this.stock = stock;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
