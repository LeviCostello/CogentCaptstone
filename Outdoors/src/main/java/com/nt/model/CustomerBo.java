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
@Table(name = "customerQuery", schema = "greatoutdoors")
public class CustomerBo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "custId")
	private int custId;
	@Size(max = 30)
	@Column(name = "fName")
	private String fName;
	@Size(max = 30)
	@Column(name = "lName")
	private String lName;
	@Size(max = 30)
	private String email;
	@Column(columnDefinition = "LONGTEXT")
	private String query;
}
