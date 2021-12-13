package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nt.model.CustomerBo;

@CrossOrigin
@Repository
public interface MySqlCustomer extends JpaRepository<CustomerBo, Integer>{
}
