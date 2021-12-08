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
public class CustomerBo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer custId;
	private String fName;
	private String lName;
	private String email;
	private String query;
}
