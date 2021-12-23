package com.go.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.go.model.Cart;
import com.go.model.CustomerQuery;
import com.go.model.DeliveryAddress;
import com.go.model.Order;
import com.go.model.Product;
import com.go.model.User;
import com.go.repository.MySqlCart;
import com.go.repository.MySqlCustomer;
import com.go.repository.MySqlDelivery;
import com.go.repository.MySqlOrder;
import com.go.repository.MySqlProduct;
import com.go.repository.MySqlUser;

import com.go.security.service.JwtUserDetailsImpl;

@Service
public class ServiceImpl implements UserDetailsService{

	@Autowired
	private MySqlCart cartRep;
	@Autowired
	private MySqlCustomer custQueryRep;
	@Autowired
	private MySqlDelivery addressRep;
	@Autowired
	private MySqlOrder orderRep;
	@Autowired
	private MySqlProduct productRep;
	@Autowired
	private MySqlUser userRep;
	
	public Product saveProduct(Product product) {
        return productRep.save(product);
    }
	public Cart saveCart(Cart cart) {
        return cartRep.save(cart);
    }
	public CustomerQuery saveQuery(CustomerQuery query) {
        return custQueryRep.save(query);
    }
	public Order saveOrder(Order order) {
        return orderRep.save(order);
    }
	public DeliveryAddress saveAddress(DeliveryAddress address) {
        return addressRep.save(address);
    }
	public User saveUser(User user) {
        return userRep.save(user);
    }
	public List<Product> getProductList(){
		return productRep.findAll();
	}
	public List<Product> getProductById(int id){
		List<Product> product = new ArrayList<>();
		product.add(productRep.findById(id).get());
		return product;
	}
	public List<Product> getProductByCategory(String category){
		return productRep.findByCategory(category);
	}
	public List<Cart> getCartList() {
		return cartRep.findAll();
	}
	public List<Cart> getCartById(int id){
		return cartRep.findById(id);
	}
	public void deleteCart(Cart cart) {
		cartRep.delete(cart);
	}
	public List<Cart> getCartByUserId(int id){
		User user = userRep.getById(id);
		return cartRep.findByUser(user);
	}
	public User getUserById(int id) {
		return userRep.getById(id);
	}
	public List<User> getAllUsers(){
		return userRep.findAll();
	}
	
	public User login(String email, String password) {
		Optional<User> user = userRep.findByEmail(email);
		User u1 = new User();
		if(user.isPresent()) {
			u1 = user.get();
		}
		return u1;
	}
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRep.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with email: " + email));
		return JwtUserDetailsImpl.build(user);
	}
}
