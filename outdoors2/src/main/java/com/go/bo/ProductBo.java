package com.go.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductBo {
	private Integer ProdId;
	private String name;
	private String description;
	private Float price;
	private String category;
}
