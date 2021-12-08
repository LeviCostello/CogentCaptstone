package com.go.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerBo {
	private Integer custId;
	private String fName;
	private String lName;
	private String email;
	private String query;
}
