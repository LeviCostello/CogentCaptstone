package com.go.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderBo {
	private Integer orderId;
	private Integer userId;
	private Integer prodId;
	private Integer quantity;
	private Float price;
}
