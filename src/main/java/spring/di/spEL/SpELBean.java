package spring.di.spEL;

import java.util.List;

public class SpELBean {
	
	private int id;
	
	private String name;
	
	private List<String> childrens;
	
	private long time;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChildrens(List<String> childrens) {
		this.childrens = childrens;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getChildrens() {
		return childrens;
	}

	public long getTime() {
		return time;
	}
	
	
}
