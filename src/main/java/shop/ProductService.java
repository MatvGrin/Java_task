package shop;

import java.util.Objects;

public class ProductService {

    private Product[] products;

    {
        Product product1 = new Product(1,"Salt","China",865,8);
        Product product2 = new Product(2,"Milk","Ukraine",46,1259);
        Product product3 = new Product(3,"Apple","Ukraine",21,1000);
        Product product4 = new Product(4,"telefone","Russia",4200,34);
        products = new Product[]{product1, product2, product3, product4};
    }

//    public ProductService(Product[] products) {
//        this.products = products;
//    }

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
