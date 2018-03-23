package spring.jms.receiver;

import spring.jpa.domain.Users;

public class UserHandler {

	public void print(Users users) {
		System.out.println("接受到新消息："+users);
	}
}
