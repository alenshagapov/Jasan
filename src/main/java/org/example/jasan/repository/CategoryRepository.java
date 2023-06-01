package org.example.jasan.repository;

import org.example.jasan.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    boolean existsCategoryById(int id);
}
