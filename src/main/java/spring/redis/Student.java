package spring.redis;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4496273058237665577L;

	private long id;
	
	private String name;
	
	private String grade;

	public Student(long id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}	
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
