package org.example.jasan.controller;

import org.example.jasan.model.dto.ProductDto;
import org.example.jasan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/product")
@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/createProduct/{id}")
    public String createProduct(@RequestBody ProductDto productDto, @PathVariable int id){
        return productService.createProduct(productDto, id);
    }
}
