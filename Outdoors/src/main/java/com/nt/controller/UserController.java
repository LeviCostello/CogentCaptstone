package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Cart;
import com.nt.model.CustomerQuery;
import com.nt.model.DeliveryAddress;
import com.nt.model.Order;
import com.nt.model.Product;
import com.nt.model.User;
import com.nt.service.impl.ServiceImpl;

@RestController
@RequestMapping("/go")
@CrossOrigin
public class UserController {

	@Autowired
	private ServiceImpl service;
	
	//Adding the entities
	//adding Cart
	@PostMapping("/addCart")
	public ResponseEntity<String> addCart(@RequestParam("productId") int productId,
    		@RequestParam("price") int price, @RequestParam("userId") int userId) {
		Product product = service.getProductById(productId).get(0);
		User user = service.getUser(userId);
		Cart cart = new Cart(user, product, 1, price);
        service.saveCart(cart);
        return new ResponseEntity<>("Cart #" + cart.getCartId() + " was saved.", HttpStatus.OK);
    }
	
	//changing to a different cart
//	@PostMapping("/changeCart")
//    public ResponseEntity<String> changeCart(@RequestParam("cartId") int cartId, @RequestParam("quantity")int quantity, @RequestParam("productId")int productId) {
//		List<Cart> cart_list = service.getCartById(cartId);
//		if(cart_list != null) {
//			Cart cart = cart_list.get(0);
//			Product product = service.getProductById(productId).get(0);
//			cart.setProduct(product);
//			cart.setQuantity(quantity);
//			cart.setPrice(quantity*product.getPrice());
//			service.saveCart(cart);
//			return new ResponseEntity<>("Cart #" + cart.getCartId() + " changes were saved.", HttpStatus.OK);
//		}
//		return new ResponseEntity<>("Cart #" + cartId + " was not found!", HttpStatus.NOT_FOUND);
//		
//    }
	
	//add customer
	@PostMapping("/addCustomer")
    public ResponseEntity<String> addQuery(@RequestBody CustomerQuery query) {
        service.saveCustomer(query);
        return new ResponseEntity<>("Query from Customer " + query.getCustId() + " was created.", HttpStatus.OK);
    }
	//add delivery
	@PostMapping("/addDelivery")
	public ResponseEntity<String> addAddress(@RequestBody DeliveryAddress address) {
        service.saveDelivery(address);
        return new ResponseEntity<>("Delivery address #" + address.getAddressId() + " was added.", HttpStatus.OK);
    }
	//add order
	@PostMapping("/addOrder")
    public ResponseEntity<String> addOrder(@RequestBody Order order) {
        service.saveOrder(order);
        return new ResponseEntity<>("Order " + order.getOrderId() + " was placed.", HttpStatus.OK);
    }
	//add product
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
        service.saveProduct(product);
        return new ResponseEntity<>(product.getProductName() + " was added.", HttpStatus.OK);
    }
	//add user
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody User user) {
        service.saveUser(user);
        return new ResponseEntity<>(user.getFirstName() + " was added.", HttpStatus.OK);
    }
	
	//Getting the Entities
	//get the cart by user
	@GetMapping("/getCart")
	public List<Cart> getCart(@RequestParam("userId") int userId)
	{
		List<Cart> cartContents = service.getCartByUserId(userId);
		return cartContents;
	}
	//get all the carts
	@GetMapping("/getAllCarts")
	public List<Cart> getCartList(){
		return service.getCarts();
	}
	//get the cart by id
	@GetMapping("/getCartById")
	public List<Cart> getCartById(@RequestParam("cartId") int cartId){
		return service.getCart(cartId);
	}
	//get all products
	@GetMapping("/findAllProducts")
	public List<Product> getProductList(){
		return service.getProducts();
	}
	//get product by category
	@GetMapping("/findProductsByCategory")
	public List<Product> getProductsByCategory(@RequestParam("category") String category){
		return service.getProduct(category);
	}
	//get product by id
	@GetMapping("/findProductsById")
	public List<Product> getProductsById(@RequestParam("id") int id){

		return service.getProductById(id);
	}
	
	//Deleting the Entities
	//delete Cart
	@DeleteMapping("/deleteCart")
	public ResponseEntity<String> deleteCart(@RequestParam("cartId") int cartId){
		Cart cart = service.getCart(cartId).get(0);
		service.deleteCart(cart);
		return new ResponseEntity<>("Cart #" + cartId + " was deleted.", HttpStatus.OK);
	}
	
	//login and signup
}
