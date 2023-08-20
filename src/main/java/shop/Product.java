package shop;

public class Product {
    private int id;
    private String name;
    private String country;
    private int price;
    private int quantity;


    public Product(int id, String name, String producingCountry, int cost, int quantity) {
        this.id = id;
        this.name = name;
        this.country = producingCountry;
        this.price = cost;
        this.quantity = quantity;
    }

    public Product() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int totalPrice(){
        return price * quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producingCountry='" + country + '\'' +
                ", cost=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
