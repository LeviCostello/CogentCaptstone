package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nt.model.ProductBo;

@CrossOrigin
@Repository
public interface MySqlProduct extends JpaRepository<ProductBo, Integer>{
	List<ProductBo> findByCategory(String cName);
	List<ProductBo> findByProductId(int id);
	List<ProductBo> findByProductNameContaining(String productName);
}
