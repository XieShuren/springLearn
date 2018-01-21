package spring.learn;

import java.util.List;

public class Computer implements Item{

	private int id;
	
	private List<String> userNames;


	public void setId(int id) {
		this.id = id;
	}


	public void setUserNames(List<String> userNames) {
		this.userNames = userNames;
	}


	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void name() {
		// TODO Auto-generated method stub
		System.out.println("my name is Computer"+id);
		for (String userName : userNames) {
			System.out.print(userName + ",");
		}
	}
	
}
