package com.go.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.go.model.Cart;
import com.go.model.User;

@CrossOrigin
@Repository
public interface MySqlCart extends JpaRepository<Cart, Integer>{
	public List<Cart> findByUser(User user);
	public List<Cart> findAll();
	public List<Cart> findById(int id);
}
