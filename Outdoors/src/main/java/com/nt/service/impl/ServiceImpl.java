package com.nt.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Cart;
import com.nt.model.CustomerQuery;
import com.nt.model.DeliveryAddress;
import com.nt.model.Order;
import com.nt.model.Product;
import com.nt.model.User;
import com.nt.repository.MySqlCart;
import com.nt.repository.MySqlCustomer;
import com.nt.repository.MySqlDelivery;
import com.nt.repository.MySqlOrder;
import com.nt.repository.MySqlProduct;
import com.nt.repository.MySqlUser;

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
	public Cart saveCart(Cart cart) {
		return cartRep.save(cart);
	}
	
	public CustomerQuery saveCustomer(CustomerQuery customer) {
		return customerRep.save(customer);
	}
	public DeliveryAddress saveDelivery(DeliveryAddress delivery) {
		return deliveryRep.save(delivery);
	}
	
	public Order saveOrder(Order order) {
		return orderRep.save(order);
	}
	
	public Product saveProduct(Product product) {
		return productRep.save(product);
	}
	
	public User saveUser(User user) {
		return userRep.save(user);
	}
	
	//Find all entities.
	public List<Cart> getCarts() {
		return cartRep.findAll();
	}
	
	public List<CustomerQuery> getCustomers() {
		return customerRep.findAll();
	}
	public List<DeliveryAddress> getDeliveries() {
		return deliveryRep.findAll();
	}
	
	public List<Order> getOrders() {
		return orderRep.findAll();
	}
	
	public List<Product> getProducts() {
		return productRep.findAll();
	}
	
	public List<User> getUsers() {
		return userRep.findAll();
	}
	
	//Find at least one entity.
		public List<Cart> getCart(int id) {
			return cartRep.findById(id);
		}
		
		public List<Cart> getCartByUserId(int id){
			User user = userRep.getById(id);
			return cartRep.findByUser(user);
		}
		
		public CustomerQuery getCustomer(int id) {
			return customerRep.getById(id);
		}
		public DeliveryAddress getDelivery(int id) {
			return deliveryRep.getById(id);
		}
		
		public Order getOrder(int id) {
			return orderRep.getById(id);
		}
		
		public List<Product> getProduct(String category) {
			return productRep.findByCategory(category);
		}
		public List<Product> getProductById(int id){
			List<Product> product = new ArrayList<>();
			product.add(productRep.findById(id).get());
			return product;
		}
		
		public User getUser(int id) {
			return userRep.getById(id);
		}
	
	//Delete one or multiple entites from the repositories
	public void deleteCart(Cart cart) {
		cartRep.delete(cart);
	}
	
	public void deleteCustomer(CustomerQuery customer) {
		customerRep.save(customer);
	}
	public void deleteDelivery(DeliveryAddress delivery) {
		deliveryRep.save(delivery);
	}
	
	public void deleteOrder(Order order) {
		orderRep.save(order);
	}
	
	public void deleteProduct(Product product) {
		productRep.save(product);
	}
	
	public void deleteUser(User user) {
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
