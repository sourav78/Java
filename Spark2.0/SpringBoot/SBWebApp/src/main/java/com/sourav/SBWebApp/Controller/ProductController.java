package com.sourav.SBWebApp.Controller;

import com.sourav.SBWebApp.Model.Product;
import com.sourav.SBWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProduct(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public void addNewProduct(@RequestBody Product product){
        System.out.println(product.toString());
        productService.addNewProduct(product);
    }
}
