import java.util.*;
import java.text.*;
import java.io.*;
public class Main{
    public static void main(String[] noargs){
        Product product1 = new Product("soap", 22.72, "is soap", "health");
        Product product2 = new Product("pen", 8.63, "is pen", "tools");

        Catalog.getInstance().addProduct(product1);
        Catalog.getInstance().addProduct(product2);

        System.out.println(Catalog.getInstance().searchProduct(product1.getID()).getProductInfo());

        Catalog temp = Catalog.getInstance();
        System.out.println(temp.searchProduct(product2.getID()).getProductInfo());

        Catalog.getInstance().removeProduct(product1.getID());
        System.out.println("removed product1, soap ----------");

        Iterator<Product> productIterator = temp.getAllProducts();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product.getProductInfo());
        }
    }
}