package org.example.jasan.service;

import org.example.jasan.model.Product;
import org.example.jasan.model.dto.ProductDto;
import org.example.jasan.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private CategoryService categoryService;

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    public String createProduct(ProductDto productDto, int categoryId){
        if (categoryService.checkIfCategoryExist(categoryId)){
            save(new Product(productDto));
            return "Success";
        }
        return "Wrong category";
    }

    @Transactional
    public Product save(Product product){
        return productRepository.save(product);
    }
}
