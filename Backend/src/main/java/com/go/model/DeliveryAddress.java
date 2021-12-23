package com.go.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "delivery_address_table", schema = "greatoutdoors")
public class DeliveryAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private int addressId;
	@Size(max = 60)
	@Column(name = "address_line_1")
	private String addressLine1;
	@Size(max = 60)
	@Column(name = "address_line_2")
	private String addressLine2;
	@Size(max = 30)
	private String state;
	private int pincode;
	
	@OneToOne(mappedBy = "da")
	private Order order;
	
}
