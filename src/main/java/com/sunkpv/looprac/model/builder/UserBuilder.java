package com.sunkpv.looprac.model.builder;

import com.sunkpv.looprac.model.User;

/**
 * Builder class to build an User instance.
 * @author sunil
 */
public class UserBuilder {

	private User user;
	
	public UserBuilder() {
		user = new User();
	}
	
	public User getUser() {
		return this.user;
	}
	
	public UserBuilder setId(int id) {
		user.setId(id);
		return this;
	}
	
	public UserBuilder setEmail(String email) {
		user.setEmail(email);
		return this;
	}
	
	public UserBuilder setName(String name) {
		user.setName(name);
		return this;
	}
	
	public UserBuilder setPhoneNumber(String phoneNumber) {
		user.setPhoneNumber(phoneNumber);
		return this;
	}
}
