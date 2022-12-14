package com.guvenleye.guvenleYe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "admin")

public class Admin {
	
	@Id
	@GeneratedValue
	@Column(name = "admin_id")
	private int adminID;
	
	@Column(name = "admin_first_name")
	private String adminFirstName;
	
	@Column(name = "admin_last_name")
	private String adminLastName;
	
	@Column(name = "mails")
	private String adminMail;
	
	// Constructors
	
	public Admin(int adminID, String adminFirstName, String adminLastName, String adminMail) {
		this.adminID = adminID;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminMail = adminMail;
	}
	
	public Admin()
	{
		
	}
	
	// Getter-Setter Methods
	
	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminMail() {
		return adminMail;
	}

	public void setAdminMail(String adminMail) {
		this.adminMail = adminMail;
	}
	
	
		
}
