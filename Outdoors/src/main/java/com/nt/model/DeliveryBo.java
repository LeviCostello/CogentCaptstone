package com.nt.model;

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
@Table(name = "delivAddTable", schema = "greatoutdoors")
public class DeliveryBo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "addId")
	private int addId;
	@Size(max = 60)
	@Column(name = "addLine1")
	private String addLine1;
	@Size(max = 60)
	@Column(name = "addLine2")
	private String addLine2;
	@Size(max = 30)
	private String state;
	private int zipcode;
	
	@OneToOne(mappedBy = "da")
	private OrderBo order;
}
