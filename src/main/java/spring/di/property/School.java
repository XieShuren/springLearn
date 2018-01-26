package spring.di.property;

import org.springframework.beans.factory.annotation.Value;

public class School {
	private int id;
	
	private String address;
	
	private String name;

	public School() {
		super();
	}

	public School(int id, String address, String name) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("id="+id+",address="+address+",name="+name);
	}
}
