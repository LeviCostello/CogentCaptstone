package com.go.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	
	@Size(max = 30)
	@Column(name = "first_name")
	private String firstName;
	@Size(max = 30)
	@Column(name = "last_name")
	private String lastName;
	@Size(max = 10)
	@Column(name = "phone_number")
	private String phoneNumber;
	@Size(max = 30)
	@Email
	@NotBlank
	private String email;
	@Size(max = 30)
	@NotBlank
	@JsonIgnore
	private String password;
	@Size(max = 60)
	@Column(name = "address_line_1")
	private String addressLine1;
	@Size(max = 60)
	@Column(name = "address_line_2")
	private String addressLine2;
	@Size(max = 30)
	private String state;
	private int pincode;
	
	@OneToMany(mappedBy = "user")
	private List<Order> orderList;
	@OneToMany(mappedBy = "user")
	private List<Cart> cartList;
	
	public User(String firstName, String lastName, String phoneNumber, String email, String password,
			String addressLine1, String addressLine2, String state, int pincode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.pincode = pincode;
	}
	
}