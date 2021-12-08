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
@Entity(name="user")
public class UserBo {

	private int userId;
	private String fName;private String lName;
	private String pNum;private String email;private String password;
	private String addLine1;private String addLine2;
	private String state;private int zipcode;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public void setUserId(int id) {this.userId=id;}
	public int getUserId() {return this.userId;}
	
	@Column(name="fName")
	public void setFName(String fname) {this.fName=fname;}
	public String getFName() {return this.fName;}
	
	
	// Helpful method for unit testing, nonessential for app functionality
	@Override
	public String toString() {
		return "User userId="+userId+", fName="+fName
		+", lName="+lName+", phone number="+pNum+", email="+email+", password="
		+password+", addLine1="+addLine1+", addLine2="+addLine2+", state="
		+state+", zipcode="+zipcode;
	}
}
