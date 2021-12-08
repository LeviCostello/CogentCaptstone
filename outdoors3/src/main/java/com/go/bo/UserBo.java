package com.go.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserBo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private String fName;private String lName;
	private String pNum;private String email;private String password;
	private String addLine1;private String addLine2;
	private String state;private int zipcode;
}
