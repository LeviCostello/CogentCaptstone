package com.nt.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.CartBO;
import com.nt.model.CustomerBo;
import com.nt.model.DeliveryBo;
import com.nt.model.OrderBo;
import com.nt.model.ProductBo;
import com.nt.model.UserBo;
import com.nt.repository.MySqlCart;
import com.nt.repository.MySqlCustomer;
import com.nt.repository.MySqlDelivery;
import com.nt.repository.MySqlOrder;
import com.nt.repository.MySqlProduct;
import com.nt.repository.MySqlUser;
import com.nt.service.UserService;

@Service
public class ServiceImpl {

	@Autowired
	private MySqlCart cartRep;
	@Autowired
	private MySqlCustomer customerRep;
	@Autowired
	private MySqlDelivery deliveryRep;
	@Autowired
	private MySqlOrder orderRep;
	@Autowired
	private MySqlProduct productRep;
	@Autowired
	private MySqlUser userRep;
	
	//Save the entities with the objects we have currently manipulated
	public CartBO saveCart(CartBO cart) {
		return cartRep.save(cart);
	}
	
	public CustomerBo saveCustomer(CustomerBo customer) {
		return customerRep.save(customer);
	}
	public DeliveryBo saveDelivery(DeliveryBo delivery) {
		return deliveryRep.save(delivery);
	}
	
	public OrderBo saveOrder(OrderBo order) {
		return orderRep.save(order);
	}
	
	public ProductBo saveProduct(ProductBo product) {
		return productRep.save(product);
	}
	
	public UserBo saveUser(UserBo user) {
		return userRep.save(user);
	}
	
	//Find all entities.
	public List<CartBO> getCarts() {
		return cartRep.findAll();
	}
	
	public List<CustomerBo> getCustomers() {
		return customerRep.findAll();
	}
	public List<DeliveryBo> getDeliveries() {
		return deliveryRep.findAll();
	}
	
	public List<OrderBo> getOrders() {
		return orderRep.findAll();
	}
	
	public List<ProductBo> getProducts() {
		return productRep.findAll();
	}
	
	public List<UserBo> getUsers() {
		return userRep.findAll();
	}
	
	//Find at least one entity.
		public List<CartBO> getCart(int id) {
			return cartRep.findById(id);
		}
		
		public List<CartBO> getCartByUserId(int id){
			UserBo user = userRep.getById(id);
			return cartRep.findByUser(user);
		}
		
		public CustomerBo getCustomer(int id) {
			return customerRep.getById(id);
		}
		public DeliveryBo getDelivery(int id) {
			return deliveryRep.getById(id);
		}
		
		public OrderBo getOrder(int id) {
			return orderRep.getById(id);
		}
		
		public List<ProductBo> getProduct(String category) {
			return productRep.findByCategory(category);
		}
		public List<ProductBo> getProductById(int id){
			List<ProductBo> product = new ArrayList<>();
			product.add(productRep.findById(id).get());
			return product;
		}
		
		public UserBo getUser(int id) {
			return userRep.getById(id);
		}
	
	//Delete one or multiple entites from the repositories
	public void deleteCart(CartBO cart) {
		cartRep.delete(cart);
	}
	
	public void deleteCustomer(CustomerBo customer) {
		customerRep.save(customer);
	}
	public void deleteDelivery(DeliveryBo delivery) {
		deliveryRep.save(delivery);
	}
	
	public void deleteOrder(OrderBo order) {
		orderRep.save(order);
	}
	
	public void deleteProduct(ProductBo product) {
		productRep.save(product);
	}
	
	public void deleteUser(UserBo user) {
		userRep.save(user);
	}
	
	//login information
//	public UserBo login(String email, String password) {
//		Optional<UserBo> user = userRep.findByEmail(email);
//		UserBo u1 = new UserBo();
//		if(user.isPresent()) {
//			u1 = user.get();
//		}
//		return u1;
//	}
}
