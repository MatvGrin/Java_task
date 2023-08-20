package Shop;

public class Product {
    private int id;
    private String name;
    private String producingCountry;
    private int cost;
    private int quantity;


    public Product(int id, String name, String producingCountry, int cost, int quantity) {
        this.id = id;
        this.name = name;
        this.producingCountry = producingCountry;
        this.cost = cost;
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

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String totalPrice(){
        return "Total price: " + (cost * quantity);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", producingCountry='" + producingCountry + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                '}';
    }
}
