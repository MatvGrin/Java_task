package shop;

import java.util.Objects;

public class ProductService {

    private Product[] products;

    public ProductService(Product[] products) {
        this.products = products;
    }

    public void showAllProducts(){
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void showNameAndQuantityAllProducts(){
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + "; Quantity: " + product.getQuantity());
        }
    }

    public int getAllPrice(){
        int res = 0;
        for (Product product : products) {
            res += product.totalPrice();
        }
        return res;
    }

    public Product findProductById(int id){
        for (Product product : products) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    public Product findProductByName(String name){
        for (Product product : products) {
            if (Objects.equals(product.getName(), name)){
                return product;
            }
        }
        return null;
    }
}
