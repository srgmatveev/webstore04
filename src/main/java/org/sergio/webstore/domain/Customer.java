package org.sergio.webstore.domain;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 6888557231320304508L;
	private Integer customerId;
	private String name;
	private String address;
	private boolean noOfOrdersMade;
	
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int i) {
		this.customerId = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isNoOfOrdersMade() {
		return noOfOrdersMade;
	}

	public void setNoOfOrdersMade(boolean noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String name, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
}
