package org.example.jasan.repository;

import org.example.jasan.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
}
