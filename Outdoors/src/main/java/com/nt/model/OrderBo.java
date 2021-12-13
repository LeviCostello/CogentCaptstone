package com.nt.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="orderTable", schema = "greatoutdoors")
public class OrderBo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId")
	private int orderId;
	@ManyToOne
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private UserBo userId;
	@ManyToOne
	@JoinColumn(name = "prodId", referencedColumnName = "prodId")
	private ProductBo prodId;
	private int quantity;
	private int price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "orderAddTable", joinColumns = @JoinColumn(name = "orderId"), inverseJoinColumns = @JoinColumn(name = "addId"))
	private DeliveryBo da;
}
