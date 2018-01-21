package spring.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Company {
	
	private Computer computer;
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void process() {
		computer.name();
	}
}
