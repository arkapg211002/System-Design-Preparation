package LowLevelDesign.DesignOrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

    int productCategoryId;
    String categoryName;
    List<Product> products = new ArrayList<>();
    double price;


    public void addProduct(Product product){
        products.add(product);
    }

    //remove products
    public void removeProduct(int count){
        for(int i=1;i<=count;i++){
            products.remove(0);
        }
    }

    //get products
}
