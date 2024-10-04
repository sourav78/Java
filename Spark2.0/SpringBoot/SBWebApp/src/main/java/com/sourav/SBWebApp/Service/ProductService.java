package com.sourav.SBWebApp.Service;

import com.sourav.SBWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> allProducts = new ArrayList<>(Arrays.asList(
            new Product(101, "Phone", 120000),
            new Product(102, "Laptop", 230000),
            new Product(103, "TV", 30000)
    ));

    public List<Product> getProducts(){
        return allProducts;
    }

    public Product getProductById(int productId) {
        return allProducts
                .stream()
                .filter(prod -> prod.getId() == productId)
                .findFirst()
                .orElse(new Product(0, "No item found", 0));
    }

    public void addNewProduct(Product product){
        allProducts.add(product);
    }
}
