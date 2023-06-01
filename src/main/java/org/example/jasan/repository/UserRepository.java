package org.example.jasan.repository;

import org.example.jasan.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
    ArrayList<Users> findAll();
}
