package com.nt.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UserBo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private int userId;
	@Size(max = 30)
	@Column(name = "fName")
	private String fName;
	@Size(max = 30)
	@Column(name = "lName")
	private String lName;
	@Size(max = 10)
	@Column(name = "pNum")
	private String pNum;
	@Size(max = 30)
	@Email
	@NotBlank
	private String email;
	@Size(max=30)
	@NotBlank
	@JsonIgnore
	private String password;
	@Size(max = 60)
	@Column(name = "addLine1")
	private String addLine1;
	@Size(max = 60)
	@Column(name = "addLine2")
	private String addLine2;
	@Size(max = 30)
	private String state;
	private int zipcode;
	
	@OneToMany(mappedBy = "UserBo")
	private List<OrderBo> orderList;
	@OneToMany(mappedBy = "UserBo")
	private List<CartBO> cartList;
}
