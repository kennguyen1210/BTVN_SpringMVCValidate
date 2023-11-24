package ra.academy.dto;

public class FormRequest {
    private String name;
    private double price;
    private int stock;
    private String des;

    public FormRequest() {
    }

    public FormRequest(String name, double price, int stock, String des) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.des = des;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
