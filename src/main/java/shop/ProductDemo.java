package shop;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Salt","China",865,8);
        Product product2 = new Product(2,"Milk","Ukraine",46,1259);
        Product product3 = new Product(3,"Apple","Ukraine",21,1000);
        Product product4 = new Product(4,"telefone","Russia",4200,34);

        Product[] products = {product1,product2,product3,product4};
        ProductService service = new ProductService(products);
        service.showAllProducts();
        service.showNameAndQuantityAllProducts();
        System.out.println("All Price: " + service.getAllPrice());
        System.out.println(service.findProductById(3));
        System.out.println(service.findProductById(5));
        System.out.println(service.findProductByName("Salt"));
        System.out.println(service.findProductByName("Meat"));

    }
}
