package com.guvenleye.guvenleYe.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "manager")
@Entity

public class Manager {

	@Id
	@GeneratedValue
	@Column(name = "manager_id")
	private int managerID;
	
	@Column(name = "manager_first_name")
	private String managerFirstName;
	
	@Column(name = "manager_last_name")
	private String managerLastName;
	
	@Column(name = "manager_mail")
	private String managerMail;

	// Getter-Setter Methods
	public int getManagerID() {
		return managerID;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public String getManagerFirstName() {
		return managerFirstName;
	}

	public void setManagerFirstName(String managerFirstName) {
		this.managerFirstName = managerFirstName;
	}

	public String getManagerLastName() {
		return managerLastName;
	}

	public void setManagerLastName(String managerLastName) {
		this.managerLastName = managerLastName;
	}

	public String getManagerMail() {
		return managerMail;
	}

	public void setManagerMail(String managerMail) {
		this.managerMail = managerMail;
	}
	
	
}
