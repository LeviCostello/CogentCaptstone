package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductBo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prodId")
	private Integer ProdId;
	@Size(max = 30)
	@Column(name = "prodName")
	private String prodName;
	@Size(max = 200)
	private String description;
	private int price;
	@Size(max = 20)
	private String category;
}
