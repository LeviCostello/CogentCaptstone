package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nt.model.CartBO;
import com.nt.model.UserBo;

@CrossOrigin
@Repository
public interface MySqlCart extends JpaRepository<CartBO, Integer>{
	public List<CartBO> findByUser(UserBo user);
	public List<CartBO> findAll();
	public List<CartBO> findById(int id);
}
