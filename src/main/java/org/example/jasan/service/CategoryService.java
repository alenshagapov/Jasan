package org.example.jasan.service;

import org.example.jasan.model.Category;
import org.example.jasan.model.dto.CategoryDto;
import org.example.jasan.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public boolean checkIfCategoryExist(int categoryId){
        return categoryRepository.existsCategoryById(categoryId);
    }

    public int createCategory(CategoryDto categoryDto){
        return save(new Category(categoryDto)).getId();
    }

    @Transactional
    public Category save(Category category){
        return categoryRepository.save(category);
    }
}
