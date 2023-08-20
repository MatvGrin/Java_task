package shop;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product(10,"Poroh","China",865,8);
        Product product2 = new Product();

        product2.setId(91);
        product2.setName("Milk");
        product2.setCountry("Ukraine");
        product2.setCost(46);
        product2.setQuantity(1259);
        System.out.println("Id: " + product2.getId());
        System.out.println("Name: " + product2.getName());
        System.out.println("Producing country: " + product2.getCountry());
        System.out.println("Cost: " + product2.getCost());
        System.out.println("Quantity: " + product2.getQuantity());

        System.out.println(product1.totalPrice());
        System.out.println(product1);
    }
}
