package com.go.controller;

import java.util.List;

//import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.go.bo.CartBO;
import com.go.bo.CustomerBo;
import com.go.bo.DeliveryBo;
import com.go.bo.OrderAddBo;
import com.go.bo.OrderBo;
import com.go.bo.ProductBo;
import com.go.bo.UserBo;
import com.go.dao.MySqlCart;
import com.go.dao.MySqlCustomer;
import com.go.dao.MySqlDelivery;
import com.go.dao.MySqlOrderAdd;
import com.go.dao.MySqlUser;
import com.go.dao.MySqlUserImpl;
import com.go.service.UserService;
import com.go.service.UserServiceImpl;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
public class MainController {
//	@Autowired
//	private MySqlCart cart;
//	@Autowired
//	private MySqlCustomer customer;
//	@Autowired
//	private MySqlDelivery delivery;
//	@Autowired
//	private MySqlOrderAdd orderAdd;
//	@Autowired
//	private OrderBo order;
//	@Autowired
//	private ProductBo product;
	@Autowired
	private UserServiceImpl user;
	
	//User table controller
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	//@PostMapping("/")
//	public  UserBo createUser(@ModelAttribute UserBo bo, HttpServletRequest request) {
//		return MySqlUserImpl.db
//	}
//	@PutMapping("/")
//	
//	@DeleteMapping("/")
	
	//Product Table Controller
}
