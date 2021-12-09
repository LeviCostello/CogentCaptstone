package com.go.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DeliveryBo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addId;
	private String addLine1;
	private String addLine2;
	private String state;
	private Integer zipcode;
}
