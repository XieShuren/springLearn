package spring.mongodb;


import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

	@Id
	private String id;
	
	private String customer;
	
	private String type;

	
	public Order() {
		super();
	}

	public Order(String id, String customer, String type) {
		super();
		this.id = id;
		this.customer = customer;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
