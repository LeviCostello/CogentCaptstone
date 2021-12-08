package com.go.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartBO {
	private Integer cartId;
	private Integer userId;
	private Integer productId;
	private Integer quantityId;
}
