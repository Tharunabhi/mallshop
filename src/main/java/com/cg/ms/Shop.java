package com.cg.ms;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Shop {
	
	private int id;
	private String category;
	private int employeeID;
	private String name;
	private String customers;
	private String status;
	private String owner;
	private String leaseStatus;
	
	
	public Shop() {
		super();
	}


	public Shop(int id, String category, int employeeID, String name, String customers, String status, String owner,
			String leaseStatus) {
		super();
		this.id = id;
		this.category = category;
		this.employeeID = employeeID;
		this.name = name;
		this.customers = customers;
		this.status = status;
		this.owner = owner;
		this.leaseStatus = leaseStatus;
	}
	@Id
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCustomers() {
		return customers;
	}


	public void setCustomers(String customers) {
		this.customers = customers;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public String getLeaseStatus() {
		return leaseStatus;
	}


	public void setLeaseStatus(String leaseStatus) {
		this.leaseStatus = leaseStatus;
	}


	@Override
	public String toString() {
		return "Shop [id=" + id + ", category=" + category + ", employeeID=" + employeeID + ", name=" + name
				+ ", customers=" + customers + ", status=" + status + ", owner=" + owner + ", leaseStatus="
				+ leaseStatus + ", getId()=" + getId() + ", getCategory()=" + getCategory() + ", getEmployeeID()="
				+ getEmployeeID() + ", getName()=" + getName() + ", getCustomers()=" + getCustomers() + ", getStatus()="
				+ getStatus() + ", getOwner()=" + getOwner() + ", getLeaseStatus()=" + getLeaseStatus()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
	
	