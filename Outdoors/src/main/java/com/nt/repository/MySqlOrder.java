package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.nt.model.DeliveryBo;
import com.nt.model.OrderBo;

@CrossOrigin()
@Repository
public interface MySqlOrder extends JpaRepository<OrderBo, Integer>{
}
