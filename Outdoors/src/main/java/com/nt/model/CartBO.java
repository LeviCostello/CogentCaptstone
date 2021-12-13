package com.nt.model;

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
public class CartBO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartId")
	private int cartId;
	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private UserBo userId;
	@ManyToOne
	@JoinColumn(name = "pruductId", referencedColumnName = "productId")
	private ProductBo productId;
	private int quantityId;
	private int price;
	
	public CartBO(UserBo user, ProductBo product, int quantity, int price) {
		super();
		this.userId = user;
		this.productId = product;
		this.quantityId = quantity;
		this.price = price;
	}
}
