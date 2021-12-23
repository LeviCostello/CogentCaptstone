package com.go.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.go.model.User;

@CrossOrigin
@Repository
public interface MySqlUser extends JpaRepository<User, Integer>{
	User findByFirstName(String name);
	Optional<User> findByEmail(String email);
}
