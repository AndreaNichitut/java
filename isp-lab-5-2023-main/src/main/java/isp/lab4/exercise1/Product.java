package isp.lab4.exercise1;

public class Product {
    private String productId;
    private String name;
    private double price;
    private ProductCategory productCategory;
    public Product(String productId,String name,double price,ProductCategory productCategory) {
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.productCategory=productCategory;
    }

}
