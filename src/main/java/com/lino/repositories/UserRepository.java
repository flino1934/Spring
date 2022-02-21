package com.lino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lino.model.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
