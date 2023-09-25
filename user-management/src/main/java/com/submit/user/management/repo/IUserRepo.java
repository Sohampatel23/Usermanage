package com.submit.user.management.repo;

import com.submit.user.management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {
}
