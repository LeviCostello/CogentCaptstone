package com.go.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cart_table", schema = "greatoutdoors")
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int cartId;
	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	private Product product;
	private int quantity;
	private int price;

	public Cart(User user, Product product, int quantity, int price) {
		super();
		this.user = user;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
}
