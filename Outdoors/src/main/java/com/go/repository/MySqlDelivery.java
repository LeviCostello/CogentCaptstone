package com.go.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.go.model.DeliveryAddress;

@CrossOrigin
@Repository
public interface MySqlDelivery extends JpaRepository<DeliveryAddress, Integer>{
}
