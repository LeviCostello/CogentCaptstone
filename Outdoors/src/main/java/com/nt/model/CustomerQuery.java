package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_query", schema = "greatoutdoors")
public class CustomerQuery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private int custId;
	
	@Size(max = 30)
	@Column(name = "first_name")
	private String firstName;
	@Size(max = 30)
	@Column(name = "last_name")
	private String lastName;
	@Size(max = 30)
	private String email;
	
	@Column(columnDefinition = "LONGTEXT")
	private String query;

}