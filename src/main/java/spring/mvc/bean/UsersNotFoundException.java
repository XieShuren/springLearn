package spring.mvc.bean;

public class UsersNotFoundException extends RuntimeException{
	private int userId;

	public UsersNotFoundException(int userId) {
		super();
		this.userId = userId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
}
