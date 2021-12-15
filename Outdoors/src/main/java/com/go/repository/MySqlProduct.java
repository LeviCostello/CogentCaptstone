package com.go.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.go.model.Product;

@CrossOrigin
@Repository
public interface MySqlProduct extends JpaRepository<Product, Integer>{
	List<Product> findByCategory(String cName);
	List<Product> findByProductId(int id);
	List<Product> findByProductNameContaining(String productName);
}
