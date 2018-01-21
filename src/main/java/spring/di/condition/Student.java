package spring.di.condition;

public class Student {
	private int id;

	public void setId(int id) {
		this.id = id;
	}
	
	public void study() {
		System.out.println("id="+id+"is studying");
	}
}
