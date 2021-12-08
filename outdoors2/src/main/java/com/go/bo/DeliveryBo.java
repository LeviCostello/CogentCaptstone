package com.go.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryBo {
	private Integer addId;
	private String addLine1;
	private String addLine2;
	private String state;
	private Integer zipcode;
}
