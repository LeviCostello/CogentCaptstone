package com.nt.repository;

import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nt.model.UserBo;

@CrossOrigin
@Repository
public interface MySqlUser extends JpaRepository<UserBo, Integer>{
	UserBo findByFirstName(String name);
	Optional<UserBo> findByEmail(String email);
}
